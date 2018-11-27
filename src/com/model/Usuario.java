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
	 * Constructor de Usuario
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
	 * getter de nombre
	 * @return nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * getter de apellidos
	 * @return apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * getter de carrera
	 * @return carrera
	 */
	public String getCarrera() {
		return Carrera;
	}

	/**
	 * getter de correos
	 * @return correos
	 */
	public ArrayList<Correo> getCorreos() {
		return Correos;
	}

	/**
	 * getter de telefonos
	 * @return telefonos
	 */
	public ArrayList<Telefono> getTelefonos() {
		return Telefonos;
	}

	/**
	 * getter de fechaRegistro
	 * @return fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * getter de id
	 * @return id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * getter de tipoUsuario
	 * @return tipoUsuario
	 */
	public int getTipoUsuario() {
		return TipoUsuario;
	}

	/**
	 * getter de habilidades
	 * @return habilidades
	 */
	public String getHabilidades() {
		return Habilidades;
	}

	/**
	 * getter de descripcion
	 * @return descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}

	/**
	 * getter de universidad
	 * @return universidad
	 */
	public String getUniversidad() {
		return Universidad;
	}

	/**
	 * setter de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * setter de apellidos
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	/**
	 * setter de carrera
	 * @param carrera
	 */
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	/**
	 * setter de correos
	 * @param correos
	 */
	public void setCorreos(ArrayList<Correo> correos) {
		Correos = correos;
	}

	/**
	 * setter de telefonos
	 * @param telefonos
	 */
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		Telefonos = telefonos;
	}

	/**
	 * setter de fechaRegistro
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * setter de id
	 * @param id
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * setter de tipoUsuario
	 * @param tipoUsuario
	 */
	public void setTipoUsuario(int tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}

	/**
	 * setter de habilidades
	 * @param habilidades
	 */
	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

	/**
	 * setter de descripcion
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	/**
	 * setter de universidad
	 * @param universidad
	 */
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	
	
	
}
