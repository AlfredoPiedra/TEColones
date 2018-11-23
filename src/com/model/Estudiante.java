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
@Table(name = "Estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEstudiante")
	private int idEstudiante;
	
	@Column(name = "Carnet")
	private String Carnet;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaRegistro")
	private Date FechaRegistro;
	
	@Column(name = "TEColonesDisponibles")
	private double TEColonesDisponibles;
	
	@Column(name = "Carrera")
	private String Carrera;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private int idPersona;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private int idTipoUsuario;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private int idCuenta;
	
	public Estudiante() {
		
	}

	/**
	 * @param idEstudiante
	 * @param carnet
	 * @param fechaRegistro
	 * @param tEColonesDisponibles
	 * @param carrera
	 * @param idPersona
	 * @param idTipoUsuario
	 * @param idCuenta
	 */
	public Estudiante(int idEstudiante, String carnet, Date fechaRegistro, double tEColonesDisponibles, String carrera,
			int idPersona, int idTipoUsuario, int idCuenta) {
		this.idEstudiante = idEstudiante;
		Carnet = carnet;
		FechaRegistro = fechaRegistro;
		TEColonesDisponibles = tEColonesDisponibles;
		Carrera = carrera;
		this.idPersona = idPersona;
		this.idTipoUsuario = idTipoUsuario;
		this.idCuenta = idCuenta;
	}

	/**
	 * @return the idEstudiante
	 */
	public int getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * @param idEstudiante the idEstudiante to set
	 */
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/**
	 * @return the carnet
	 */
	public String getCarnet() {
		return Carnet;
	}

	/**
	 * @param carnet the carnet to set
	 */
	public void setCarnet(String carnet) {
		Carnet = carnet;
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

	/**
	 * @return the tEColonesDisponibles
	 */
	public double getTEColonesDisponibles() {
		return TEColonesDisponibles;
	}

	/**
	 * @param tEColonesDisponibles the tEColonesDisponibles to set
	 */
	public void setTEColonesDisponibles(double tEColonesDisponibles) {
		TEColonesDisponibles = tEColonesDisponibles;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return Carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the idTipoUsuario
	 */
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	/**
	 * @param idTipoUsuario the idTipoUsuario to set
	 */
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	/**
	 * @return the idCuenta
	 */
	public int getIdCuenta() {
		return idCuenta;
	}

	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", Carnet=" + Carnet + ", FechaRegistro=" + FechaRegistro
				+ ", TEColonesDisponibles=" + TEColonesDisponibles + ", Carrera=" + Carrera + ", idPersona=" + idPersona
				+ ", idTipoUsuario=" + idTipoUsuario + ", idCuenta=" + idCuenta + "]";
	}

}
