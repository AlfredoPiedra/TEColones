package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name = "Correo")
 */

public class Correo {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idCorreo")
	 */
	private int idCorreo;
	
	/**
	 * @Column(name = "Correo")
	 */
	private String Correo;
	
	/**
	 * @OneToOne
	 *@JoinColumn(name="Persona_idPersona")
	 */
	private Persona idPersona;
	
	public Correo() {
	
	}

	/**
	 * Constructor de Correo
	 * @param idCorreo
	 * @param correo
	 * @param idPersona
	 */
	public Correo(int idCorreo, String correo, Persona idPersona) {
		this.idCorreo = idCorreo;
		Correo = correo;
		this.idPersona = idPersona;
	}



	/**
	 * getter de idPersona
	 * @return idPersona
	 */
	public Persona getIdPersona() {
		return idPersona;
	}

	/**
	 * setter de idPersona
	 * @param idPersona
	 */
	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Constructor de Correo
	 * @param idCorreo
	 * @param correo
	 * @param idPersona
	 */
	public Correo(String correo, Persona idPersona) {
		this.idCorreo = idCorreo;
		Correo = correo;
		this.idPersona = idPersona;
	}

	/**
	 * getter de idCorreo
	 * @return idCorreo
	 */
	public int getIdCorreo() {
		return idCorreo;
	}

	/**
	 * setter de idCorreo
	 * @param idCorreo
	 */
	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}

	/**
	 * getter de correo
	 * @return correo
	 */
	public String getCorreo() {
		return Correo;
	}

	/**
	 * setter de correo
	 * @param correo
	 */
	public void setCorreo(String correo) {
		Correo = correo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Correo [idCorreo=" + idCorreo + ", Correo=" + Correo + "]";
	}
	
	

}
