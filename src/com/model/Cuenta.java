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
 * @Table(name = "Cuenta")
 */
public class Cuenta {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idCuenta")
	 */
	private int idCuenta;
	
	/**
	 * @Column(name = "Contrasena")
	 */
	private String Contrasena;
	
	/**
	 * @Column(name = "FotoPerfil")
	 */
	private String FotoPerfil;
	
	/**
	 * @Column(name = "Validez")
	 */
	private boolean Validez;
	
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "TipoUsuario_idTipoUsuario")
	 */
	private TipoUsuario idTipoUsuario;
	
	/**
	 * @Temporal(TemporalType.DATE)
	 * @Column(name = "FechaRegistro")
	 */
	private Date FechaRegistro;
	
	/**
	 * getter de validez
	 * @return validez
	 */
	public boolean isValidez() {
		return Validez;
	}

	/**
	 * setter de validez
	 * @param validez
	 */
	public void setValidez(boolean validez) {
		Validez = validez;
	}
	
	/**
	 * getter de idTipoUsuario
	 * @return idTipoUsuario
	 */
	public TipoUsuario getIdTipoUsuario() {
		return idTipoUsuario;
	}

	/**
	 * setter de idTipoUsuario
	 * @param idTipoUsuario
	 */
	public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	/**
	 * Constructor de Cuenta
	 * @param idCuenta
	 * @param usuario
	 * @param contrasena
	 * @param fotoPerfil
	 * @param validez
	 * @param idTipoUsuario
	 * @param fechaRegistro
	 */
	public Cuenta(int idCuenta, String contrasena, String fotoPerfil, boolean validez,
			TipoUsuario idTipoUsuario, Date fechaRegistro) {
		this.idCuenta = idCuenta;
		Contrasena = contrasena;
		FotoPerfil = fotoPerfil;
		Validez = validez;
		this.idTipoUsuario = idTipoUsuario;
		FechaRegistro = fechaRegistro;
	}

	/**
	 * Constructor de Cuenta
	 * @param idCuenta
	 * @param usuario
	 * @param contrasena
	 * @param fotoPerfil
	 * @param validez
	 * @param idTipoUsuario
	 * @param fechaRegistro
	 */
	public Cuenta(String contrasena, String fotoPerfil, boolean validez,
			TipoUsuario idTipoUsuario, Date fechaRegistro) {
		Contrasena = contrasena;
		FotoPerfil = fotoPerfil;
		Validez = validez;
		this.idTipoUsuario = idTipoUsuario;
		FechaRegistro = fechaRegistro;
	}

	/**
	 * getter de fechaRegistro
	 * @return fechaRegistro
	 */
	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	/**
	 * setter de fechaRegistro
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	/**
	 * getter de idCuenta
	 * @return idCuenta
	 */
	public int getIdCuenta() {
		return idCuenta;
	}

	/**
	 * setter de idCuenta
	 * @param idCuenta
	 */
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	/**
	 * getter de contrasena
	 * @return contrasena
	 */
	public String getContrasena() {
		return Contrasena;
	}

	/**
	 * setter de contrasena
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	/**
	 * getter de fotoPerfil
	 * @return fotoPerfil
	 */
	public String getFotoPerfil() {
		return FotoPerfil;
	}

	/**
	 * setter de fotoPerfil
	 * @param fotoPerfil
	 */
	public void setFotoPerfil(String fotoPerfil) {
		FotoPerfil = fotoPerfil;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", Contrasena=" + Contrasena + ", FotoPerfil=" + FotoPerfil + "]";
	}
	
	

}
