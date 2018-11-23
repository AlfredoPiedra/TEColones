package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Correo")
public class Correo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCorreo")
	private int idCorreo;
	
	@Column(name = "Correo")
	private String Correo;
	
	public Correo() {
	
	}

	/**
	 * @param idCorreo
	 * @param correo
	 */
	public Correo(int idCorreo, String correo) {
		this.idCorreo = idCorreo;
		Correo = correo;
	}

	/**
	 * @return the idCorreo
	 */
	public int getIdCorreo() {
		return idCorreo;
	}

	/**
	 * @param idCorreo the idCorreo to set
	 */
	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return Correo;
	}

	/**
	 * @param correo the correo to set
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
