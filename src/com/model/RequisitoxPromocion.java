package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RequisitoxPromocion")
public class RequisitoxPromocion {

	@Id
	@Column(name="idRequisitoxPromocion")
	private int idRequisitoxPromocion;
	
	@OneToOne
	@JoinColumn(name = "RequisitoPromocion_idRequisitoPromocion")
	private RequisitoPromocion idRequisitoPromocion;
	
	
	@OneToOne
	@JoinColumn(name = "Promocion_idPromocion")
	private Promocion idPromocion;
	
	public RequisitoxPromocion() {
		
	}
	
	/**
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
	 * @param idRequisitoPromocion
	 * @param idPromocion
	 */
	public RequisitoxPromocion(RequisitoPromocion idRequisitoPromocion, Promocion idPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
		this.idPromocion = idPromocion;
	}

	/**
	 * @return the idRequisitoPromocion
	 */
	public RequisitoPromocion getIdRequisitoPromocion() {
		return idRequisitoPromocion;
	}

	/**
	 * @param idRequisitoPromocion the idRequisitoPromocion to set
	 */
	public void setIdRequisitoPromocion(RequisitoPromocion idRequisitoPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
	}

	/**
	 * @return the idPromocion
	 */
	public Promocion getIdPromocion() {
		return idPromocion;
	}

	/**
	 * @param idPromocion the idPromocion to set
	 */
	public void setIdPromocion(Promocion idPromocion) {
		this.idPromocion = idPromocion;
	}

	/**
	 * @return the idRequisitoxPromocion
	 */
	public int getIdRequisitoxPromocion() {
		return idRequisitoxPromocion;
	}

	/**
	 * @param idRequisitoxPromocion the idRequisitoxPromocion to set
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
