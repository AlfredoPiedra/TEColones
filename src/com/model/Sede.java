package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name = "Sede")
 */
public class Sede {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idSede")
	 */
	private int idSede;
	
	/**
	 * @Column(name = "Nombre")
	 */
	private String Nombre;
	
	public Sede() {
		
	}

	/**
	 * Constructor de Sede
	 * @param idSede
	 * @param nombre
	 */
	public Sede(int idSede, String nombre) {
		this.idSede = idSede;
		Nombre = nombre;
	}

	/**
	 * getter de idSede
	 * @return idSede
	 */
	public int getIdSede() {
		return idSede;
	}

	/**
	 * setter de idSede
	 * @param idSede
	 */
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}

	/**
	 * getter de nombre
	 * @return nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sede [idSede=" + idSede + ", Nombre=" + Nombre + "]";
	}

}
