package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	public Cuenta() {
		
	}

	/**
	 * @param idCuenta
	 * @param contrasena
	 * @param fotoPerfil
	 */
	public Cuenta(int idCuenta, String contrasena, String fotoPerfil) {
		this.idCuenta = idCuenta;
		Contrasena = contrasena;
		FotoPerfil = fotoPerfil;
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
