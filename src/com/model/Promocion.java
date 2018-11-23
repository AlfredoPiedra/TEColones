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
@Table(name = "Promocion")
public class Promocion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPromocion")
	private int idPromocion;
	
	@Column(name = "MontoPromocion")
	private double MontoPromocion;
	
	@OneToOne
	@JoinColumn(name = "idTipoPromocion")
	private int idTipoPromocion;
	
	public Promocion() {
		
	}

	/**
	 * @param idPromocion
	 * @param montoPromocion
	 * @param idTipoPromocion
	 */
	public Promocion(int idPromocion, double montoPromocion, int idTipoPromocion) {
		this.idPromocion = idPromocion;
		MontoPromocion = montoPromocion;
		this.idTipoPromocion = idTipoPromocion;
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

	/**
	 * @return the montoPromocion
	 */
	public double getMontoPromocion() {
		return MontoPromocion;
	}

	/**
	 * @param montoPromocion the montoPromocion to set
	 */
	public void setMontoPromocion(double montoPromocion) {
		MontoPromocion = montoPromocion;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Promocion [idPromocion=" + idPromocion + ", MontoPromocion=" + MontoPromocion + ", idTipoPromocion="
				+ idTipoPromocion + "]";
	}

}
