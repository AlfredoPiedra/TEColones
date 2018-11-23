package com.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RequisitoxPromocion")
public class RequisitoxPromocion {

	@OneToOne
	@JoinColumn(name = "idRequisitoPromocion")
	private int idRequisitoPromocion;
	
	@OneToOne
	@JoinColumn(name = "idPromocion")
	private int idPromocion;
	
	public RequisitoxPromocion() {
		
	}

	/**
	 * @param idRequisitoPromocion
	 * @param idPromocion
	 */
	public RequisitoxPromocion(int idRequisitoPromocion, int idPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
		this.idPromocion = idPromocion;
	}

	/**
	 * @return the idRequisitoPromocion
	 */
	public int getIdRequisitoPromocion() {
		return idRequisitoPromocion;
	}

	/**
	 * @param idRequisitoPromocion the idRequisitoPromocion to set
	 */
	public void setIdRequisitoPromocion(int idRequisitoPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
	}

	/**
	 * @return the idPromocion
	 */
	public int getIdPromocion() {
		return idPromocion;
	}

	/**
	 * @param idPromocion the idPromocion to set
	 */
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RequisitoxPromocion [idRequisitoPromocion=" + idRequisitoPromocion + ", idPromocion=" + idPromocion
				+ "]";
	}

}
