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
 * @Table(name = "Conversion")
 */

public class Conversion {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idConversion")
	 */
	private int idConversion;
	
	
	/**	 
	 * @Column(name = "MontoConversion")
	 */
	private double MontoConversion;
	
	
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "MaterialReciclable_idMaterialReciclable")
	 */
	
	private MaterialReciclable idMaterialReciclable;
	
	public Conversion() {
		
	}

	/**
	 * Constructor de Conversion
	 * @param idConversion
	 * @param montoConversion
	 * @param idMaterialReciclable
	 */
	public Conversion(int idConversion, double montoConversion, MaterialReciclable idMaterialReciclable) {
		this.idConversion = idConversion;
		MontoConversion = montoConversion;
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/**
	 * getter de idConversion
	 * @return the idConversion
	 */
	public int getIdConversion() {
		return idConversion;
	}

	/**
	 * setter de idConversion
	 * @param idConversion
	 */
	public void setIdConversion(int idConversion) {
		this.idConversion = idConversion;
	}

	/**
	 * getter de montoConversion
	 * @return the montoConversion
	 */
	public double getMontoConversion() {
		return MontoConversion;
	}

	/**
	 * setter de montoConversion
	 * @param montoConversion
	 */
	public void setMontoConversion(double montoConversion) {
		MontoConversion = montoConversion;
	}

	/**
	 * getter de idMaterialReciclable
	 * @return the idMaterialReciclable
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
		return "Conversion [idConversion=" + idConversion + ", MontoConversion=" + MontoConversion
				+ ", idMaterialReciclable=" + idMaterialReciclable + "]";
	}

}
