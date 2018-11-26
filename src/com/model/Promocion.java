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
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name = "MontoPromocion")
	private double MontoPromocion;
	
	@Column(name = "Validez")
	private boolean Validez;
	
	@OneToOne
	@JoinColumn(name = "TipoPromocion_idTipoPromocion")
	private TipoPromocion idTipoPromocion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaInicio")
	private Date FechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaFinalizacion")
	private Date FechaFinalizacion;

	
	public Promocion(){
		
		
	}
	
	/**
	 * @param idPromocion
	 * @param nombre
	 * @param montoPromocion
	 * @param validez
	 * @param idTipoPromocion
	 * @param fechaInicio
	 * @param fechaFinalizacion
	 */
	public Promocion(int idPromocion, String nombre, double montoPromocion, boolean validez,
			TipoPromocion idTipoPromocion, Date fechaInicio, Date fechaFinalizacion) {
		this.idPromocion = idPromocion;
		Nombre = nombre;
		MontoPromocion = montoPromocion;
		Validez = validez;
		this.idTipoPromocion = idTipoPromocion;
		FechaInicio = fechaInicio;
		FechaFinalizacion = fechaFinalizacion;
	}

	/**
	 * @param nombre
	 * @param montoPromocion
	 * @param validez
	 * @param idTipoPromocion
	 * @param fechaInicio
	 * @param fechaFinalizacion
	 */
	public Promocion(String nombre, double montoPromocion, boolean validez, TipoPromocion idTipoPromocion,
			Date fechaInicio, Date fechaFinalizacion) {
		Nombre = nombre;
		MontoPromocion = montoPromocion;
		Validez = validez;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @return the montoPromocion
	 */
	public double getMontoPromocion() {
		return MontoPromocion;
	}

	/**
	 * @return the validez
	 */
	public boolean isValidez() {
		return Validez;
	}

	/**
	 * @return the idTipoPromocion
	 */
	public TipoPromocion getIdTipoPromocion() {
		return idTipoPromocion;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return FechaInicio;
	}

	/**
	 * @return the fechaFinalizacion
	 */
	public Date getFechaFinalizacion() {
		return FechaFinalizacion;
	}

	/**
	 * @param idPromocion the idPromocion to set
	 */
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @param montoPromocion the montoPromocion to set
	 */
	public void setMontoPromocion(double montoPromocion) {
		MontoPromocion = montoPromocion;
	}

	/**
	 * @param validez the validez to set
	 */
	public void setValidez(boolean validez) {
		Validez = validez;
	}

	/**
	 * @param idTipoPromocion the idTipoPromocion to set
	 */
	public void setIdTipoPromocion(TipoPromocion idTipoPromocion) {
		this.idTipoPromocion = idTipoPromocion;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	/**
	 * @param fechaFinalizacion the fechaFinalizacion to set
	 */
	public void setFechaFinalizacion(Date fechaFinalizacion) {
		FechaFinalizacion = fechaFinalizacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Promocion [idPromocion=" + idPromocion + ", Nombre=" + Nombre + ", MontoPromocion=" + MontoPromocion
				+ ", Validez=" + Validez + ", idTipoPromocion=" + idTipoPromocion + ", FechaInicio=" + FechaInicio
				+ ", FechaFinalizacion=" + FechaFinalizacion + "]";
	}


}
