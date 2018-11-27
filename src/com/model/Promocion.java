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

/**
 * @Entity
 *@Table(name = "Promocion")
 */
public class Promocion {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idPromocion")
	 */
	private int idPromocion;
	
	/**
	 * @Column(name="Nombre")
	 */
	private String Nombre;
	
	/**
	 * @Column(name = "MontoPromocion")
	 */
	private double MontoPromocion;
	
	/**
	 * @Column(name = "Validez")
	 */
	private boolean Validez;
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "TipoPromocion_idTipoPromocion")
	 */
	private TipoPromocion idTipoPromocion;
	
	/**
	 * @Temporal(TemporalType.DATE)
	 * @Column(name = "FechaInicio")
	 */
	private Date FechaInicio;
	
	/**
	 * @Temporal(TemporalType.DATE)
	 *@Column(name = "FechaFinalizacion")
	 */
	private Date FechaFinalizacion;

	
	public Promocion(){
		
		
	}
	
	/**
	 * Constructor de Promocion
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
	 * Constructor de Promocion
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
	 * getter de idPromocion
	 * @return idPromocion
	 */
	public int getIdPromocion() {
		return idPromocion;
	}

	/**
	 * getter de nombre
	 * @return nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * getter de montoPromocion
	 * @return montoPromocion
	 */
	public double getMontoPromocion() {
		return MontoPromocion;
	}

	/**
	 * getter de validez
	 * @return validez
	 */
	public boolean isValidez() {
		return Validez;
	}

	/**
	 * getter de idTipoPromocion
	 * @return idTipoPromocion
	 */
	public TipoPromocion getIdTipoPromocion() {
		return idTipoPromocion;
	}

	/**
	 * getter de fechaInicio
	 * @return fechaInicio
	 */
	public Date getFechaInicio() {
		return FechaInicio;
	}

	/**
	 * getter de fechaFinalizacion
	 * @return fechaFinalizacion
	 */
	public Date getFechaFinalizacion() {
		return FechaFinalizacion;
	}

	/**
	 * setter de idPromocion
	 * @param idPromocion
	 */
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	/**
	 * setter de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * setter de montoPromocion
	 * @param montoPromocion
	 */
	public void setMontoPromocion(double montoPromocion) {
		MontoPromocion = montoPromocion;
	}

	/**
	 * setter de validez
	 * @param validez
	 */
	public void setValidez(boolean validez) {
		Validez = validez;
	}

	/**
	 * setter de idTipoPromocion
	 * @param idTipoPromocion
	 */
	public void setIdTipoPromocion(TipoPromocion idTipoPromocion) {
		this.idTipoPromocion = idTipoPromocion;
	}

	/**
	 * setter de fechaInicio
	 * @param fechaInicio
	 */
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	/**
	 * setter de fechaFinalizacion
	 * @param fechaFinalizacion
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
