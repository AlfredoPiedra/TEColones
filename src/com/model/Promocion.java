package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@JoinColumn(name = "TipoPromocion_idTipoPromocion")
	private TipoPromocion idTipoPromocion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaInicio")
	private Date FechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaFinalizacion")
	private Date FechaFinalizacion;
	
	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return FechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFinalizacion
	 */
	public Date getFechaFinalizacion() {
		return FechaFinalizacion;
	}

	/**
	 * @param fechaFinalizacion the fechaFinalizacion to set
	 */
	public void setFechaFinalizacion(Date fechaFinalizacion) {
		FechaFinalizacion = fechaFinalizacion;
	}

	public Promocion() {
		
	}

	/**
	 * @param idPromocion
	 * @param montoPromocion
	 * @param idTipoPromocion
	 * @param fechaInicio
	 * @param fechaFinalizacion
	 */
	public Promocion(int idPromocion, double montoPromocion, TipoPromocion idTipoPromocion, Date fechaInicio,
			Date fechaFinalizacion) {
		this.idPromocion = idPromocion;
		MontoPromocion = montoPromocion;
		this.idTipoPromocion = idTipoPromocion;
		FechaInicio = fechaInicio;
		FechaFinalizacion = fechaFinalizacion;
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
	public TipoPromocion getIdTipoPromocion() {
		return idTipoPromocion;
	}

	/**
	 * @param idTipoPromocion the idTipoPromocion to set
	 */
	public void setIdTipoPromocion(TipoPromocion idTipoPromocion) {
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
