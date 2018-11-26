package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona")
	private int idPersona;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Apellidos")
	private String Apellidos;

	@Column(name = "Universidad")
	private String Universidad;
	
	@Column(name = "Habilidades")
	private String Habilidades;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	

	public Persona() {
		
	}
	
	/**
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the universidad
	 */
	public String getUniversidad() {
		return Universidad;
	}

	/**
	 * @param universidad the universidad to set
	 */
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	/**
	 * @return the habilidades
	 */
	public String getHabilidades() {
		return Habilidades;
	}

	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
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
