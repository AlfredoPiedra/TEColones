package com.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import com.model.Correo;
import com.model.Cuenta;
import com.model.Estudiante;
import com.model.Funcionario;
import com.model.Persona;
import com.model.Telefono;
import com.model.TipoUsuario;
import com.model.Usuario;

public class HibernateUtil {
    
	private SessionFactory sessionFactory;
	
	public HibernateUtil(){
		
		sessionFactory = 
				HibernateSingleton.getSessionFactory();		
		
	}
	
	private void agregarMedios(Persona persona,
												 String Correo,
												 String Telefono,
												 ArrayList<String> Correos,
												 ArrayList<String> Telefonos){
		Session ss = 
				sessionFactory.openSession();
		 
		Transaction tx = 
				ss.beginTransaction();
		
		Correo correo = 
				new Correo(Correo,persona);
		
		Telefono telefono = 
				new Telefono(Telefono,persona);
		
		ss.save(correo);
		ss.save(telefono);
		
		for(int i = 0; i < Correos.size(); ++i){
			
			correo = 
					new Correo(Correos.get(i),persona);
			ss.save(correo);
			
		}
		
		for(int i = 0; i < Telefonos.size(); ++i){
			
			telefono = 
					new Telefono(Telefonos.get(i),persona);
			ss.save(telefono);
			
		}
		
		tx.commit();
		
		ss.close();
		
	}
	
	private void validarTipoUsuario(String TipoUsuario,
													 String Carnet,
													 String Carrera,
													 Persona persona,
													 Cuenta cuenta){
		
		Session ss = 
				sessionFactory.openSession();
		 
		Transaction tx = 
				ss.beginTransaction();
		
		if(TipoUsuario.equals("Estudiante")){
			

			Estudiante estudiante  = 
					new Estudiante(Carnet, 0, Carrera, persona,cuenta);
			
			ss.save(estudiante);
			
		}else{
			
			Funcionario funcionario = 
					new Funcionario(Carnet,false,cuenta,persona);
			
			ss.save(funcionario);
		}
		
		tx.commit();
		
		ss.close();
		
	}
	
	public void registrarUsuario(String TipoUsuario,
												 String Nombre, 
												 String Apellidos, 
												 String Universidad,
												 String Contrasena,
												 String Correo,
												 String Telefono,
												 String Carnet,
												 String Carrera,
												 String Habilidades,
												 String Descripcion,
												 ArrayList<String> Correos,
												 ArrayList<String> Telefonos){
		
		Session ss = 
				sessionFactory.openSession();
		 
		Transaction tx = 
				ss.beginTransaction();
		
		Persona persona = 
				new Persona(Nombre, Apellidos, Universidad, Habilidades,Descripcion);
		
		
		List<TipoUsuario> cuentas = 
				(List<TipoUsuario>) ss.createQuery(" from com.model.TipoUsuario tp where tp.tipoUsuario='"+TipoUsuario+"'").list();
		
		Criteria criteriaPersona = ss
			    .createCriteria(Persona.class)
			    .setProjection(Projections.max("idPersona"));
			
		Integer sigIdPersona = (Integer)criteriaPersona.uniqueResult();
		
		Criteria criteriaCuenta = ss
			    .createCriteria(Cuenta.class)
			    .setProjection(Projections.max("idCuenta"));
			
		Integer sigIdCuenta = (Integer)criteriaCuenta.uniqueResult();
		
		long millis = 
				System.currentTimeMillis();  
		
		java.sql.Date date =
				new java.sql.Date(millis);
		
		Cuenta cuenta = 
				new Cuenta(Contrasena, "sinfoto", false, cuentas.get(0), date);
		
		ss.save(cuenta);
		ss.save(persona);
		
		tx.commit();
		
		ss.close();
		
		if(sigIdPersona ==  null){
			
			persona.setIdPersona(1);
			
		}else{
			
			persona.setIdPersona(sigIdPersona+1);
			
		}
		
		if(sigIdCuenta ==  null){
			
			cuenta.setIdCuenta(1);
			
		}else{
			
			cuenta.setIdCuenta(sigIdCuenta+1);
			
		}
		
		validarTipoUsuario(TipoUsuario,Carnet,Carrera,persona,cuenta);
		agregarMedios(persona,Correo,Telefono,Correos,Telefonos);
		
		
	    String asunto = "TEColones: Link de Activación";
	    String cuerpo = "http://localhost:9090/TEColones/ActivationServlet?id="+Integer.toString(sigIdCuenta+1);
	    EmailUtil.enviarEmail(Correo, asunto, cuerpo);
	    
	
	}
	
	public Usuario encontrarUsuario(String carnet,String contrasena){
		
		
		Session ss = 
				sessionFactory.openSession();
		 
		Transaction tx = 
				ss.beginTransaction();
		
		List<Estudiante> estudiante =
				(List<Estudiante>) ss.createQuery("from com.model.Estudiante e where e.Carnet="+carnet).list();
		
		if(estudiante.size() == 1){
			
			if(estudiante.get(0).getIdCuenta().isValidez()){
				
				
				String nombre = estudiante.get(0).getIdPersona().getNombre();
				String apellidos = estudiante.get(0).getIdPersona().getApellidos();
				String universidad = estudiante.get(0).getIdPersona().getUniversidad();
				String idPersona = Integer.toString(estudiante.get(0).getIdPersona().getIdPersona());
				
				ArrayList<Correo> correos = 
						(ArrayList<Correo>) ss.createQuery("from com.model.Correo c where c.idPersona='"+idPersona+"'").list();
				
				ArrayList<Telefono> telefonos = 
						(ArrayList<Telefono>) ss.createQuery("from com.model.Telefono c where c.idPersona='"+idPersona+"'").list();
				
				Date fechaRegistro = (Date)estudiante.get(0).getIdCuenta().getFechaRegistro();
				String Id = estudiante.get(0).getCarnet();
				boolean tipoUsuario = true;
				String Habilidades = estudiante.get(0).getIdPersona().getHabilidades();
				String Descripcion = estudiante.get(0).getIdPersona().getDescripcion();
				String Carrera = estudiante.get(0).getCarrera();
				
				
				tx.commit();
				ss.close();
				return new Usuario(nombre,apellidos,Carrera,correos,telefonos,fechaRegistro,Id,tipoUsuario,Habilidades,Descripcion,universidad);
				
				
			}else{
				
				tx.commit();
				ss.close();
				return null;
				
			}
			
		}else{
			
			List<Funcionario> funcionario =
					(List<Funcionario>) ss.createQuery("from com.model.Funcionario e where e.Identificacion="+carnet).list();
			
			if(funcionario.size() == 1){
			
				if(funcionario.get(0).getIdCuenta().isValidez()){
					
					String nombre = funcionario.get(0).getIdPersona().getNombre();
					String apellidos = funcionario.get(0).getIdPersona().getApellidos();
					String universidad = funcionario.get(0).getIdPersona().getUniversidad();
					String idPersona = Integer.toString(funcionario.get(0).getIdPersona().getIdPersona());
					
					ArrayList<Correo> correos = 
							(ArrayList<Correo>) ss.createQuery("from com.model.Correo c where c.idPersona='"+idPersona+"'").list();
					
					ArrayList<Telefono> telefonos = 
							(ArrayList<Telefono>) ss.createQuery("from com.model.Telefono c where c.idPersona='"+idPersona+"'").list();
					
					Date fechaRegistro = (Date)funcionario.get(0).getIdCuenta().getFechaRegistro();
					String Id = funcionario.get(0).getIdentificacion();
					boolean tipoUsuario = false;
					String Habilidades = funcionario.get(0).getIdPersona().getHabilidades();
					String Descripcion = funcionario.get(0).getIdPersona().getDescripcion();
					
					tx.commit();
					ss.close();
					return new Usuario(nombre,apellidos,"",correos,telefonos,fechaRegistro,Id,tipoUsuario,Habilidades,Descripcion,universidad);
					
				}else{
					
					tx.commit();
					ss.close();
					return null;
					
				}
				
			}else{
				
				tx.commit();
				ss.close();
				return null;
				
			}
			
		}
		
	}
	
	public void activarCuenta(int id){
		
		Session ss = 
				sessionFactory.openSession();
		
		Transaction tx = 
				ss.beginTransaction();
		
		String update = "update Cuenta c set c.Validez = 1 where c.idCuenta = "+Integer.toString(id);
		
		ss.createQuery(update).executeUpdate();
		
		tx.commit();
		ss.close();
		
	}
	
	
	public void desactivarCuenta(String usuario, String contrasena){
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		HibernateUtil hb = new HibernateUtil();
		
		Usuario us = hb.encontrarUsuario("'2013241554'","'gato123'");
		
		System.out.println(us.toString());
		
		//hb.activarCuenta(1);
		
		/*ArrayList<String> correos = new ArrayList<String>();
		correos.add("alfredopiedra1221@gmail.com");
		
		ArrayList<String> telefonos = new ArrayList<String>();
		telefonos.add("87544412");
		
		hb.registrarUsuario("Estudiante", 
										 "Alfredo",
										 "Piedra Esquivel", 
										 "TEC",
										 "gato123", 
										 "luisalfredo1221@gmail", 
										 "87652856", 
										 "2012547828", 
										 "Ingenieria Computadores", 
										 "Programacion Extrema", 
										 "A punto de graduarme", 
										 correos, 
										 telefonos);*/
		
		
	}
	
	
}
