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
 * @Table(name = "Estudiante")
 */
public class Estudiante {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idEstudiante")
	 */
	private int idEstudiante;
	
	/**
	 * @Column(name = "Carnet")
	 */
	private String Carnet;
	
	/**
	 * @Column(name = "TEColonesDisponibles")
	 */
	private double TEColonesDisponibles;
	
	/**
	 * @Column(name = "Carrera")
	 */ 
	private String Carrera;
	
	
	/**
	 * @OneToOne
	 *@JoinColumn(name = "Persona_idPersona")
	 */
	private Persona idPersona;
	
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "Cuenta_idCuenta")
	 */
	private Cuenta idCuenta;
	
	public Estudiante() {
		
	}

	
	
	/**
	 * Constructor de Estudiante
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
	 * Constructor de Estudiante
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
	 * getter de idEstudiante
	 * @return idEstudiante
	 */
	public int getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * setter de idEstudiante
	 * @param idEstudiante
	 */
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/**
	 * getter de carnet
	 * @return carnet
	 */
	public String getCarnet() {
		return Carnet;
	}

	/**
	 * setter de carnet
	 * @param carnet
	 */
	public void setCarnet(String carnet) {
		Carnet = carnet;
	}

	/**
	 * getter de TEColonesDisponibles
	 * @return tEColonesDisponibles
	 */
	public double getTEColonesDisponibles() {
		return TEColonesDisponibles;
	}

	/**
	 * setter de TEColonesDisponibles
	 * @param tEColonesDisponibles
	 */
	public void setTEColonesDisponibles(double tEColonesDisponibles) {
		TEColonesDisponibles = tEColonesDisponibles;
	}

	/**
	 * getter de carrera
	 * @return carrera
	 */
	public String getCarrera() {
		return Carrera;
	}

	/**
	 * setter de carrera
	 * @param carrera
	 */
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	/**
	 * getter de idPersona
	 * @return idPersona
	 */
	public Persona getIdPersona() {
		return idPersona;
	}

	/**
	 * setter de idPersona
	 * @param idPersona
	 */
	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}
	
	/**
	 * getter de idCuenta
	 * @return  idCuenta
	 */
	public Cuenta getIdCuenta() {
		return idCuenta;
	}

	/**
	 * setter de idCuenta
	 * @param idCuenta
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
