package com.controller;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.model.Beneficio;
import com.model.Conversion;
import com.model.Correo;
import com.model.Cuenta;
import com.model.Estudiante;
import com.model.Funcionario;
import com.model.MaterialReciclable;
import com.model.MaterialxEstudiantexSede;
import com.model.Persona;
import com.model.Promocion;
import com.model.RequisitoPromocion;
import com.model.RequisitoxPromocion;
import com.model.Sede;
import com.model.Telefono;
import com.model.TipoCambio;
import com.model.TipoPromocion;
import com.model.TipoUsuario;

public class HibernateSingleton {

	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSession(){
			
			
			Configuration config = 
					new Configuration();
			
			config.configure("hibernate.cfg.xml");
				
			config.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
			config.setProperty("hibernate.connection.url","jdbc:mysql://127.0.0.1:3306/tecolonesdb?useSSL=false");
			config.setProperty("hibernate.connection.username","tecolonesconnection");
			config.setProperty("hibernate.connection.password","tecolonesconnection");
			config.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
			config.setProperty("hibernate.show_sql","true");
			config.setProperty("hibernate.hbm2ddl.auto","update");
				
			config.addAnnotatedClass(Cuenta.class);
			config.addAnnotatedClass(TipoUsuario.class);
			config.addAnnotatedClass(Persona.class);
			config.addAnnotatedClass(Beneficio.class);
			config.addAnnotatedClass(Conversion.class);
			config.addAnnotatedClass(Correo.class);
			config.addAnnotatedClass(Estudiante.class);
			config.addAnnotatedClass(Funcionario.class);
			config.addAnnotatedClass(MaterialReciclable.class);
			config.addAnnotatedClass(MaterialxEstudiantexSede.class);
			config.addAnnotatedClass(Promocion.class);
			config.addAnnotatedClass(RequisitoPromocion.class);
			config.addAnnotatedClass(RequisitoxPromocion.class);
			config.addAnnotatedClass(Sede.class);
			config.addAnnotatedClass(Telefono.class);
			config.addAnnotatedClass(TipoPromocion.class);
			config.addAnnotatedClass(TipoCambio.class);
	    	
			try{
				
				SessionFactory ssFactory = 
						config.buildSessionFactory();
				
				return ssFactory;
				
			}catch (Throwable ex) {
		        
				System.err.println("Initial SessionFactory creation failed." + ex);
		        throw new ExceptionInInitializerError(ex);
		    
			}
			
		}

		public static SessionFactory getSessionFactory() {
	       
			if(sessionFactory == null){
				
				sessionFactory = 
						buildSession();
			}
	        
			return sessionFactory;
		
		}
		
}
