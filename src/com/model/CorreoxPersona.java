package com.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CorreoxPersona")
public class CorreoxPersona {

	@OneToOne
	@JoinColumn(name = "idCorreo")
	private int idCorreo;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private int idPersona;
	
	public CorreoxPersona() {
		
	}

	/**
	 * @param idCorreo
	 * @param idPersona
	 */
	public CorreoxPersona(int idCorreo, int idPersona) {
		this.idCorreo = idCorreo;
		this.idPersona = idPersona;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CorreoxPersona [idCorreo=" + idCorreo + ", idPersona=" + idPersona + "]";
	}

}
