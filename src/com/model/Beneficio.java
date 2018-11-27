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
 * @Table(name = "Beneficio") 
 */

public class Beneficio {

	/**
	 *@Id
	 *@GeneratedValue(strategy = GenerationType.IDENTITY)
	 *@Column(name = "idBeneficio")
	 */
	private int idBeneficio;
	private String Beneficio;
	
	/**
	 * @OneToOne
	 * @JoinColumn(name="TipoCambio_idTipoCambio")
	 */

	private TipoCambio idTipoCambio;
	
	/**
	 * Constructor vacío de Beneficio
	 */
	public Beneficio() {
		
	}

	/**
	 * Constructor de Beneficio
	 * @param idBeneficio
	 * @param beneficio
	 * @param idTipoCambio
	 */
	public Beneficio(int idBeneficio, String beneficio, TipoCambio idTipoCambio) {
		this.idBeneficio = idBeneficio;
		Beneficio = beneficio;
		this.idTipoCambio = idTipoCambio;
	}


	/**
	 * Constructor de Beneficio
	 * @param beneficio
	 * @param idTipoCambio
	 */
	public Beneficio(String beneficio, TipoCambio idTipoCambio) {
		Beneficio = beneficio;
		this.idTipoCambio = idTipoCambio;
	}



	/**
	 * getter the idBeneficio
	 * @return idBeneficio
	 */
	public int getIdBeneficio() {
		return idBeneficio;
	}

	
	/**
	 * setea el valor de idBeneficio
	 * @param idBeneficio
	 */
	public void setIdBeneficio(int idBeneficio) {
		this.idBeneficio = idBeneficio;
	}

	/**
	 * getter de beneficio
	 * @return beneficio
	 */
	public String getBeneficio() {
		return Beneficio;
	}

	
	/**
	 * setter de beneficio
	 * @param beneficio
	 */
	public void setBeneficio(String beneficio) {
		Beneficio = beneficio;
	}
	

	/**
	 * @return the idTipoCambio
	 */
	public TipoCambio getIdTipoCambio() {
		return idTipoCambio;
	}


	/**
	 * @param idTipoCambio the idTipoCambio to set
	 */
	public void setIdTipoCambio(TipoCambio idTipoCambio) {
		this.idTipoCambio = idTipoCambio;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beneficio [idBeneficio=" + idBeneficio + ", Beneficio=" + Beneficio + "]";
	}
	
}
