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
@Table(name = "Funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFuncionario")
	private int idFuncionario;
	
	@Column(name = "Identificacion")
	private String Identificacion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaRegistro")
	private Date FechaRegistro;
	
	@Column(name = "esAdmin")
	private boolean esAdmin;
	
	@OneToOne
	@JoinColumn(name = "idCuenta")
	private int idCuenta;
	
	@OneToOne
	@JoinColumn(name = "idTipoUsuario")
	private int idTipoUsuario;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private int idPersona;
	
	public Funcionario() {
	
	}

	/**
	 * @param idFuncionario
	 * @param identificacion
	 * @param fechaRegistro
	 * @param esAdmin
	 * @param idCuenta
	 * @param idTipoUsuario
	 * @param idPersona
	 */
	public Funcionario(int idFuncionario, String identificacion, Date fechaRegistro, boolean esAdmin, int idCuenta,
			int idTipoUsuario, int idPersona) {
		this.idFuncionario = idFuncionario;
		Identificacion = identificacion;
		FechaRegistro = fechaRegistro;
		this.esAdmin = esAdmin;
		this.idCuenta = idCuenta;
		this.idTipoUsuario = idTipoUsuario;
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
	public int getIdCuenta() {
		return idCuenta;
	}

	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", Identificacion=" + Identificacion + ", FechaRegistro="
				+ FechaRegistro + ", esAdmin=" + esAdmin + ", idCuenta=" + idCuenta + ", idTipoUsuario=" + idTipoUsuario
				+ ", idPersona=" + idPersona + "]";
	}

}
