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
@Table(name = "Conversion")
public class Conversion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idConversion")
	private int idConversion;
	
	@Column(name = "MontoConversion")
	private double MontoConversion;
	
	@OneToOne
	@JoinColumn(name = "idMaterialReciclable")
	private int idMaterialReciclable;
	
	public Conversion() {
		
	}

	/**
	 * @param idConversion
	 * @param montoConversion
	 * @param idMaterialReciclable
	 */
	public Conversion(int idConversion, double montoConversion, int idMaterialReciclable) {
		this.idConversion = idConversion;
		MontoConversion = montoConversion;
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/**
	 * @return the idConversion
	 */
	public int getIdConversion() {
		return idConversion;
	}

	/**
	 * @param idConversion the idConversion to set
	 */
	public void setIdConversion(int idConversion) {
		this.idConversion = idConversion;
	}

	/**
	 * @return the montoConversion
	 */
	public double getMontoConversion() {
		return MontoConversion;
	}

	/**
	 * @param montoConversion the montoConversion to set
	 */
	public void setMontoConversion(double montoConversion) {
		MontoConversion = montoConversion;
	}

	/**
	 * @return the idMaterialReciclable
	 */
	public int getIdMaterialReciclable() {
		return idMaterialReciclable;
	}

	/**
	 * @param idMaterialReciclable the idMaterialReciclable to set
	 */
	public void setIdMaterialReciclable(int idMaterialReciclable) {
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
