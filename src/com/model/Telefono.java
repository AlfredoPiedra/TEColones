package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Telefono")
public class Telefono {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTelefono")
	private int idTelefono;
	
	@Column(name = "Telefono")
	private String Telefono;
	
	public Telefono() {
		
	}
	
	/**
	 * @param idTelefono
	 * @param telefono
	 */
	public Telefono(int idTelefono, String telefono) {
		this.idTelefono = idTelefono;
		Telefono = telefono;
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return Telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Telefono [idTelefono=" + idTelefono + ", Telefono=" + Telefono + "]";
	}

}
