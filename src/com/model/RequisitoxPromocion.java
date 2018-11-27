package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name = "RequisitoxPromocion")
 */
public class RequisitoxPromocion {

	/**
	 * @Id
	 * @Column(name="idRequisitoxPromocion")
	 */
	private int idRequisitoxPromocion;
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "RequisitoPromocion_idRequisitoPromocion")
	 */
	private RequisitoPromocion idRequisitoPromocion;
	
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "Promocion_idPromocion")
	 */
	private Promocion idPromocion;
	
	public RequisitoxPromocion() {
		
	}
	
	/**
	 * Constructor de RequisitoxPromocion
	 * @param idRequisitoxPromocion
	 * @param idRequisitoPromocion
	 * @param idPromocion
	 */
	public RequisitoxPromocion(int idRequisitoxPromocion, RequisitoPromocion idRequisitoPromocion,
			Promocion idPromocion) {
		this.idRequisitoxPromocion = idRequisitoxPromocion;
		this.idRequisitoPromocion = idRequisitoPromocion;
		this.idPromocion = idPromocion;
	}



	/**
	 * Constructor de RequisitoxPromocion
	 * @param idRequisitoPromocion
	 * @param idPromocion
	 */
	public RequisitoxPromocion(RequisitoPromocion idRequisitoPromocion, Promocion idPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
		this.idPromocion = idPromocion;
	}

	/**
	 * getter de idRequisitoPromocion
	 * @return idRequisitoPromocion
	 */
	public RequisitoPromocion getIdRequisitoPromocion() {
		return idRequisitoPromocion;
	}

	/**
	 * setter de idRequisitoPromocion
	 * @param idRequisitoPromocion
	 */
	public void setIdRequisitoPromocion(RequisitoPromocion idRequisitoPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
	}

	/**
	 * getter de idPromocion
	 * @return idPromocion
	 */
	public Promocion getIdPromocion() {
		return idPromocion;
	}

	/**
	 * setter de idPromocion
	 * @param idPromocion
	 */
	public void setIdPromocion(Promocion idPromocion) {
		this.idPromocion = idPromocion;
	}

	/**
	 * getter de idRequisitoxPromocion
	 * @return idRequisitoxPromocion
	 */
	public int getIdRequisitoxPromocion() {
		return idRequisitoxPromocion;
	}

	/**
	 * setter de idRequisitoxPromocion
	 * @param idRequisitoxPromocion
	 */
	public void setIdRequisitoxPromocion(int idRequisitoxPromocion) {
		this.idRequisitoxPromocion = idRequisitoxPromocion;
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
