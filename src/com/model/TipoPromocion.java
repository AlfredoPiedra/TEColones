package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoPromocion")
public class TipoPromocion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoPromocion")
	private int idTipoPromocion;
	
	@Column(name = "Tipo")
	private String Tipo;
	
	public TipoPromocion() {
		
	}

	/**
	 * @param idTipoPromocion
	 * @param tipo
	 */
	public TipoPromocion(int idTipoPromocion, String tipo) {
		this.idTipoPromocion = idTipoPromocion;
		Tipo = tipo;
	}

	/**
	 * @return the idTipoPromocion
	 */
	public int getIdTipoPromocion() {
		return idTipoPromocion;
	}

	/**
	 * @param idTipoPromocion the idTipoPromocion to set
	 */
	public void setIdTipoPromocion(int idTipoPromocion) {
		this.idTipoPromocion = idTipoPromocion;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoPromocion [idTipoPromocion=" + idTipoPromocion + ", Tipo=" + Tipo + "]";
	}
	
}
