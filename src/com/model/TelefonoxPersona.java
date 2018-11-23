package com.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TelefonoxPersona")
public class TelefonoxPersona {

	@OneToOne
	@JoinColumn(name = "idTelefono")
	private int idTelefono;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private int idPersona;
	
	public TelefonoxPersona() {
		
	}

	/**
	 * @param idTelefono
	 * @param idPersona
	 */
	public TelefonoxPersona(int idTelefono, int idPersona) {
		this.idTelefono = idTelefono;
		this.idPersona = idPersona;
	}

	/**
	 * @return the idTelefono
	 */
	public int getIdTelefono() {
		return idTelefono;
	}

	/**
	 * @param idTelefono the idTelefono to set
	 */
	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
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
		return "TelefonoxPersona [idTelefono=" + idTelefono + ", idPersona=" + idPersona + "]";
	}
	
}
