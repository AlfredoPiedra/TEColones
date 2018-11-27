package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name = "RequisitoPromocion")
 */
public class RequisitoPromocion {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idRequisitoPromocion")
	 */
	private int idRequisitoPromocion;
	
	/**
	 * @Column(name = "CantidadRequerida")
	 */
	private double CantidadRequerida;
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "MaterialReciclable_idMaterialReciclable")
	 */
	private MaterialReciclable idMaterialReciclable;
	
	public RequisitoPromocion() {

	}

	/**
	 * Constructor de RequisitoPromocion
	 * @param idRequisitoPromocion
	 * @param cantidadRequerida
	 * @param idMaterialReciclable
	 */
	public RequisitoPromocion(int idRequisitoPromocion, double cantidadRequerida, MaterialReciclable idMaterialReciclable) {
		this.idRequisitoPromocion = idRequisitoPromocion;
		CantidadRequerida = cantidadRequerida;
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/**
	 * getter d eidRequisitoPromocion
	 * @return the idRequisitoPromocion
	 */
	public int getIdRequisitoPromocion() {
		return idRequisitoPromocion;
	}

	/**
	 * setter de idRequisitoPromocion
	 * @param idRequisitoPromocion the idRequisitoPromocion to set
	 */
	public void setIdRequisitoPromocion(int idRequisitoPromocion) {
		this.idRequisitoPromocion = idRequisitoPromocion;
	}

	/**
	 * getter de cantidadRequerida
	 * @return cantidadRequerida
	 */
	public double getCantidadRequerida() {
		return CantidadRequerida;
	}

	/**
	 * setter de cantidadRequerida
	 * @param cantidadRequerida
	 */
	public void setCantidadRequerida(double cantidadRequerida) {
		CantidadRequerida = cantidadRequerida;
	}

	/**
	 * getter de idMaterialReciclable
	 * @return idMaterialReciclable
	 */
	public MaterialReciclable getIdMaterialReciclable() {
		return idMaterialReciclable;
	}

	/**
	 * setter de idMaterialReciclable
	 * @param idMaterialReciclable
	 */
	public void setIdMaterialReciclable(MaterialReciclable idMaterialReciclable) {
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RequisitoPromocion [idRequisitoPromocion=" + idRequisitoPromocion + ", CantidadRequerida="
				+ CantidadRequerida + ", idMaterialReciclable=" + idMaterialReciclable + "]";
	}

}
