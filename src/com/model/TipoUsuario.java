package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoUsuario")
	private int idTipoUsuario;
	
	@Column(name = "TipoUsuario")
	private String tipoUsuario;
	
	public TipoUsuario() {
		
	}

	/**
	 * @param idTipoUsuario
	 * @param tipoUsuario
	 */
	public TipoUsuario(int idTipoUsuario, String tipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
		tipoUsuario = tipoUsuario;
	}

	/**
	 * @return the idTipoUsuario
	 */
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	/**
	 * @param idTipoUsuario the idTipoUsuario to set
	 */
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	/**
	 * @return the tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
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
