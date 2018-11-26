package com.model;

import java.sql.Date;
import java.util.ArrayList;

public class Usuario {

	
	private String Nombre;
	private String Apellidos;
	private String Carrera;
	private ArrayList<Correo> Correos;
	private ArrayList<Telefono> Telefonos;
	private Date fechaRegistro;
	private String Id;
	private int TipoUsuario;
	private String Habilidades;
	private String Descripcion;
	private String Universidad;
	
	public Usuario(){
		
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param carrera
	 * @param correos
	 * @param telefonos
	 * @param fechaRegistro
	 * @param id
	 * @param tipoUsuario
	 * @param habilidades
	 * @param descripcion
	 * @param universidad
	 */
	public Usuario(String nombre, String apellidos, String carrera, ArrayList<Correo> correos,
			ArrayList<Telefono> telefonos, Date fechaRegistro, String id, int tipoUsuario, String habilidades,
			String descripcion, String universidad) {
		Nombre = nombre;
		Apellidos = apellidos;
		Carrera = carrera;
		Correos = correos;
		Telefonos = telefonos;
		this.fechaRegistro = fechaRegistro;
		Id = id;
		TipoUsuario = tipoUsuario;
		Habilidades = habilidades;
		Descripcion = descripcion;
		Universidad = universidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return Carrera;
	}

	/**
	 * @return the correos
	 */
	public ArrayList<Correo> getCorreos() {
		return Correos;
	}

	/**
	 * @return the telefonos
	 */
	public ArrayList<Telefono> getTelefonos() {
		return Telefonos;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @return the tipoUsuario
	 */
	public int getTipoUsuario() {
		return TipoUsuario;
	}

	/**
	 * @return the habilidades
	 */
	public String getHabilidades() {
		return Habilidades;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}

	/**
	 * @return the universidad
	 */
	public String getUniversidad() {
		return Universidad;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	/**
	 * @param correos the correos to set
	 */
	public void setCorreos(ArrayList<Correo> correos) {
		Correos = correos;
	}

	/**
	 * @param telefonos the telefonos to set
	 */
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		Telefonos = telefonos;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(int tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}

	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	/**
	 * @param universidad the universidad to set
	 */
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	
	
	
}
