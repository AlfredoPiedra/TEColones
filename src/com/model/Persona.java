package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name = "Persona")
 */
public class Persona {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 	 * @Column(name = "idPersona")
	 */
	private int idPersona;
	
	/**
	 * @Column(name = "Nombre")
	 */
	private String Nombre;
	
	/**
	 * @Column(name = "Apellidos")
	 */
	private String Apellidos;

	/**
	 * @Column(name = "Universidad")
	 */
	private String Universidad;
	
	/**
	 * @Column(name = "Habilidades")
	 */
	private String Habilidades;
	
	/**
	 * @Column(name = "Descripcion")
	 */
	private String Descripcion;
	
	

	public Persona() {
		
	}
	
	/**
	 * Constructor de Persona
	 * @param idPersona
	 * @param nombre
	 * @param apellidos
	 * @param universidad
	 * @param habilidades
	 * @param descripcion
	 */
	public Persona(int idPersona, String nombre, String apellidos, String universidad, String habilidades,
			String descripcion) {
		this.idPersona = idPersona;
		Nombre = nombre;
		Apellidos = apellidos;
		Universidad = universidad;
		Habilidades = habilidades;
		Descripcion = descripcion;
	}



	/**
	 * Constructor de Persona
	 * @param nombre
	 * @param apellidos
	 * @param universidad
	 * @param habilidades
	 * @param descripcion
	 */
	public Persona(String nombre, String apellidos, String universidad, String habilidades, String descripcion) {
		Nombre = nombre;
		Apellidos = apellidos;
		Universidad = universidad;
		Habilidades = habilidades;
		Descripcion = descripcion;
	}



	/**
	 * getter de apellidos
	 * @return apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * setter de apellidos
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	/**
	 * getter de idPersona
	 * @return idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * setter de idPersona
	 * @param idPersona
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * getter de nombre
	 * @return nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * getter de universidad
	 * @return universidad
	 */
	public String getUniversidad() {
		return Universidad;
	}

	/**
	 * setter de universidad
	 * @param universidad
	 */
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	/**
	 * getter de habilidades
	 * @return habilidades
	 */
	public String getHabilidades() {
		return Habilidades;
	}

	/**
	 * setter de habilidades
	 * @param habilidades
	 */
	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

	/**
	 * getter de descripcion
	 * @return descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}

	/**
	 * setter de descripcion
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "Persona [idPersona=" + idPersona + ", Nombre=" + Nombre + ", PrimerApellido=" + Apellidos
				+ ", SegundoApellido=" + ", Universidad=" + Universidad + ", Habilidades="
				+ Habilidades + ", Descripcion=" + Descripcion + "]";
	}
	
	

}
