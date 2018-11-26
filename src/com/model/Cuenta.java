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
@Table(name = "Cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCuenta")
	private int idCuenta;
	
	@Column(name = "Contrasena")
	private String Contrasena;
	
	@Column(name = "FotoPerfil")
	private String FotoPerfil;
	
	@Column(name = "Validez")
	private boolean Validez;
	
	
	@OneToOne
	@JoinColumn(name = "TipoUsuario_idTipoUsuario")
	private TipoUsuario idTipoUsuario;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaRegistro")
	private Date FechaRegistro;
	
	/**
	 * @return the validez
	 */
	public boolean isValidez() {
		return Validez;
	}

	/**
	 * @param validez the validez to set
	 */
	public void setValidez(boolean validez) {
		Validez = validez;
	}
	
	/**
	 * @return the idTipoUsuario
	 */
	public TipoUsuario getIdTipoUsuario() {
		return idTipoUsuario;
	}

	/**
	 * @param idTipoUsuario the idTipoUsuario to set
	 */
	public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	/**
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
	 * @return the idTipoUsuario
	 */

	public Cuenta() {
		
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
	 * @return the contrasena
	 */
	public String getContrasena() {
		return Contrasena;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	/**
	 * @return the fotoPerfil
	 */
	public String getFotoPerfil() {
		return FotoPerfil;
	}

	/**
	 * @param fotoPerfil the fotoPerfil to set
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
