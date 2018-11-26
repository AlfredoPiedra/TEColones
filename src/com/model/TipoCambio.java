package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoCambio")
public class TipoCambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoCambio")
	private int idTipoCambio;
	
	@Column(name="TipoCambio")
	private double TipoCambio;
	
	@Column(name="FechaRegistro")
	private Date FechaRegistro;

	/**
	 * @param tipoCambio
	 * @param fechaRegistro
	 */
	public TipoCambio(double tipoCambio, Date fechaRegistro) {
		TipoCambio = tipoCambio;
		FechaRegistro = fechaRegistro;
	}

	/**
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
	 * @return the idTipoCambio
	 */
	public int getIdTipoCambio() {
		return idTipoCambio;
	}

	/**
	 * @param idTipoCambio the idTipoCambio to set
	 */
	public void setIdTipoCambio(int idTipoCambio) {
		this.idTipoCambio = idTipoCambio;
	}

	/**
	 * @return the tipoCambio
	 */
	public double getTipoCambio() {
		return TipoCambio;
	}

	/**
	 * @param tipoCambio the tipoCambio to set
	 */
	public void setTipoCambio(double tipoCambio) {
		TipoCambio = tipoCambio;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
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
