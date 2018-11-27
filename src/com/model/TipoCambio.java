package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name="TipoCambio")
 */
public class TipoCambio {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idTipoCambio")
	 */
	private int idTipoCambio;
	
	/**
	 * @Column(name="TipoCambio")
	 */
	private double TipoCambio;
	
	/**
	 * @Column(name="FechaRegistro")
	 */
	private Date FechaRegistro;

	/**
	 * Constructor de TipoCambio
	 * @param tipoCambio
	 * @param fechaRegistro
	 */
	public TipoCambio(double tipoCambio, Date fechaRegistro) {
		TipoCambio = tipoCambio;
		FechaRegistro = fechaRegistro;
	}

	/**
	 * Constructor de TipoCambio
	 * @param idTipoCambio
	 * @param tipoCambio
	 * @param fechaRegistro
	 */
	public TipoCambio(int idTipoCambio, double tipoCambio, Date fechaRegistro) {
		this.idTipoCambio = idTipoCambio;
		TipoCambio = tipoCambio;
		FechaRegistro = fechaRegistro;
	}

	/**
	 * getter de idTipoCambio
	 * @return idTipoCambio
	 */
	public int getIdTipoCambio() {
		return idTipoCambio;
	}

	/**
	 * setter de idTipoCambio
	 * @param idTipoCambio
	 */
	public void setIdTipoCambio(int idTipoCambio) {
		this.idTipoCambio = idTipoCambio;
	}

	/**
	 * getter de tipoCambio
	 * @return tipoCambio
	 */
	public double getTipoCambio() {
		return TipoCambio;
	}

	/**
	 * setter de tipoCambio 
	 * @param tipoCambio
	 */
	public void setTipoCambio(double tipoCambio) {
		TipoCambio = tipoCambio;
	}

	/**
	 * getter de fechaRegistro
	 * @return fechaRegistro
	 */
	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	/**
	 * setter de fechaRegistro
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoCambio [idTipoCambio=" + idTipoCambio + ", TipoCambio=" + TipoCambio + ", FechaRegistro="
				+ FechaRegistro + "]";
	}
	
}
