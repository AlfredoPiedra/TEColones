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
@Table(name = "Funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFuncionario")
	private int idFuncionario;
	
	@Column(name = "Identificacion")
	private String Identificacion;
	
	@Column(name = "esAdmin")
	private boolean esAdmin;
	
	
	@OneToOne
	@JoinColumn(name = "Cuenta_idCuenta")
	private Cuenta idCuenta;
	
	
	@OneToOne
	@JoinColumn(name = "Persona_idPersona")
	private Persona idPersona;
	
	public Funcionario() {
	
	}

	/**
	 * @param idFuncionario
	 * @param identificacion
	 * @param esAdmin
	 * @param idCuenta
	 * @param idPersona
	 */
	public Funcionario(int idFuncionario, String identificacion, boolean esAdmin, Cuenta idCuenta, Persona idPersona) {
		this.idFuncionario = idFuncionario;
		Identificacion = identificacion;
		this.esAdmin = esAdmin;
		this.idCuenta = idCuenta;
		this.idPersona = idPersona;
	}

	/**
	 * @param idFuncionario
	 * @param identificacion
	 * @param esAdmin
	 * @param idCuenta
	 * @param idPersona
	 */
	public Funcionario( String identificacion, boolean esAdmin, Cuenta idCuenta, Persona idPersona) {
		Identificacion = identificacion;
		this.esAdmin = esAdmin;
		this.idCuenta = idCuenta;
		this.idPersona = idPersona;
	}

	/**
	 * @return the idFuncionario
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}

	/**
	 * @param idFuncionario the idFuncionario to set
	 */
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return Identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}

	/**
	 * @return the esAdmin
	 */
	public boolean isEsAdmin() {
		return esAdmin;
	}

	/**
	 * @param esAdmin the esAdmin to set
	 */
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", Identificacion=" + Identificacion + ", FechaRegistro="
				+ ", esAdmin=" + esAdmin + ", idCuenta=" + idCuenta + ", idTipoUsuario=" + ", idPersona=" + idPersona + "]";
	}

}
