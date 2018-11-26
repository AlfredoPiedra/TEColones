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
@Table(name = "Beneficio")
public class Beneficio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idBeneficio")
	private int idBeneficio;
	
	@Column(name = "Beneficio")
	private String Beneficio;
	
	@OneToOne
	@JoinColumn(name="TipoCambio_idTipoCambio")
	private TipoCambio idTipoCambio;
	
	public Beneficio() {
		
	}

	/**
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
	 * @param beneficio
	 * @param idTipoCambio
	 */
	public Beneficio(String beneficio, TipoCambio idTipoCambio) {
		Beneficio = beneficio;
		this.idTipoCambio = idTipoCambio;
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
