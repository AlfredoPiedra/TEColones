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
	
	@Column(name = "PrimerApellido")
	private String PrimerApellido;
	
	@Column(name = "SegundoApellido")
	private String SegundoApellido;
	
	@Column(name = "Universidad")
	private String Universidad;
	
	@Column(name = "Habilidades")
	private String Habilidades;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	/**
	 * @param idPersona
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param universidad
	 * @param habilidades
	 * @param descripcion
	 */
	public Persona(int idPersona, String nombre, String primerApellido, String segundoApellido, String universidad,
			String habilidades, String descripcion) {
		
		this.idPersona = idPersona;
		Nombre = nombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		Universidad = universidad;
		Habilidades = habilidades;
		Descripcion = descripcion;
	}

	public Persona() {
		
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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return PrimerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return SegundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
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
		
		return "Persona [idPersona=" + idPersona + ", Nombre=" + Nombre + ", PrimerApellido=" + PrimerApellido
				+ ", SegundoApellido=" + SegundoApellido + ", Universidad=" + Universidad + ", Habilidades="
				+ Habilidades + ", Descripcion=" + Descripcion + "]";
	}
	
	

}
