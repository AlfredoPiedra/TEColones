package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name = "TipoUsuario")
 */
public class TipoUsuario {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idTipoUsuario")
	 */
	private int idTipoUsuario;
	
	/**
	 * @Column(name = "TipoUsuario")
	 */
	private String tipoUsuario;
	
	public TipoUsuario() {
		
	}

	/**
	 * Constructor de TipoUsuario
	 * @param idTipoUsuario
	 * @param tipoUsuario
	 */
	public TipoUsuario(int idTipoUsuario, String tipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
		tipoUsuario = tipoUsuario;
	}

	/**
	 * getter de idTipoUsuario
	 * @return the idTipoUsuario
	 */
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	/**
	 * setter de idTipoUsuario
	 * @param idTipoUsuario
	 */
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	/**
	 * getter de tipoUsuario
	 * @return tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * setter de tipoUsuario
	 * @param tipoUsuario
	 */
	public void setTipoUsuario(String tipoUsuario) {
		tipoUsuario = tipoUsuario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoUsuario [idTipoUsuario=" + idTipoUsuario + ", TipoUsuario=" + tipoUsuario + "]";
	}
	

}
