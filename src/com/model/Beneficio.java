package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Beneficio")
public class Beneficio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idBeneficio")
	private int idBeneficio;
	
	@Column(name = "Beneficio")
	private String Beneficio;
	
	public Beneficio() {
		
	}

	/**
	 * @param idBeneficio
	 * @param beneficio
	 */
	public Beneficio(int idBeneficio, String beneficio) {
		this.idBeneficio = idBeneficio;
		Beneficio = beneficio;
	}

	/**
	 * @return the idBeneficio
	 */
	public int getIdBeneficio() {
		return idBeneficio;
	}

	/**
	 * @param idBeneficio the idBeneficio to set
	 */
	public void setIdBeneficio(int idBeneficio) {
		this.idBeneficio = idBeneficio;
	}

	/**
	 * @return the beneficio
	 */
	public String getBeneficio() {
		return Beneficio;
	}

	/**
	 * @param beneficio the beneficio to set
	 */
	public void setBeneficio(String beneficio) {
		Beneficio = beneficio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beneficio [idBeneficio=" + idBeneficio + ", Beneficio=" + Beneficio + "]";
	}
	
}
