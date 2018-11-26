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
@Table(name = "Estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEstudiante")
	private int idEstudiante;
	
	@Column(name = "Carnet")
	private String Carnet;
	
	@Column(name = "TEColonesDisponibles")
	private double TEColonesDisponibles;
	
	@Column(name = "Carrera")
	private String Carrera;
	
	
	@OneToOne
	@JoinColumn(name = "Persona_idPersona")
	private Persona idPersona;
	
	
	@OneToOne
	@JoinColumn(name = "Cuenta_idCuenta")
	private Cuenta idCuenta;
	
	public Estudiante() {
		
	}

	
	
	/**
	 * @param idEstudiante
	 * @param carnet
	 * @param tEColonesDisponibles
	 * @param carrera
	 * @param idPersona
	 * @param idCuenta
	 */
	public Estudiante(int idEstudiante, String carnet, double tEColonesDisponibles, String carrera, Persona idPersona,
			Cuenta idCuenta) {
		this.idEstudiante = idEstudiante;
		Carnet = carnet;
		TEColonesDisponibles = tEColonesDisponibles;
		Carrera = carrera;
		this.idPersona = idPersona;
		this.idCuenta = idCuenta;
	}



	/**
	 * @param idEstudiante
	 * @param carnet
	 * @param tEColonesDisponibles
	 * @param carrera
	 * @param idPersona
	 * @param idCuenta
	 */
	public Estudiante(String carnet, double tEColonesDisponibles, String carrera, Persona idPersona,
								Cuenta idCuenta) {
		Carnet = carnet;
		TEColonesDisponibles = tEColonesDisponibles;
		Carrera = carrera;
		this.idPersona = idPersona;
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
	public Persona getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}
	
	/**
	 * @return the idCuenta
	 */
	public Cuenta getIdCuenta() {
		return idCuenta;
	}

	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(Cuenta idCuenta) {
		this.idCuenta = idCuenta;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", Carnet=" + Carnet + ", FechaRegistro="
				+ ", TEColonesDisponibles=" + TEColonesDisponibles + ", Carrera=" + Carrera + ", idPersona=" + idPersona
				+ ", idTipoUsuario=" + ", idCuenta=" + idCuenta + "]";
	}

}
