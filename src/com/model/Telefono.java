package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	
	@OneToOne
	@JoinColumn(name="Persona_idPersona")
	private Persona idPersona;
	
	/**
	 * @return the idPersona
	 */
	public Persona getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	public Telefono() {
		
	}
	
	/**
	 * @param idTelefono
	 * @param telefono
	 * @param idPersona
	 */
	public Telefono(int idTelefono, String telefono, Persona idPersona) {
		this.idTelefono = idTelefono;
		Telefono = telefono;
		this.idPersona = idPersona;
	}

	/**
	 * @param idTelefono
	 * @param telefono
	 * @param idPersona
	 */
	public Telefono(String telefono, Persona idPersona) {
		Telefono = telefono;
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
		return "Telefono [idTelefono=" + idTelefono + ", Telefono=" + Telefono + ", idPersona=" + idPersona + "]";
	}

	

}
