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
@Table(name = "MaterialxEstudiantexSede")
public class MaterialxEstudiantexSede {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMaterialxEstudiantexSede")
	private int idMaterialxEstudiantexSede;
	
	@Column(name = "Cantidad")
	private double Cantidad;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FechaRegistro")
	private Date FechaRegistro;
	
	
	@OneToOne
	@JoinColumn(name = "Estudiante_idEstudiante")
	private Estudiante idEstudiante;
	
	
	@OneToOne
	@JoinColumn(name = "MaterialReciclable_idMaterialReciclable")
	private MaterialReciclable idMaterialReciclable;
	
	
	@OneToOne
	@JoinColumn(name = "Sede_idSede")
	private Sede idSede;
	
	public MaterialxEstudiantexSede() {
		
	}

	/**
	 * @param idMaterialxEstudiantexSede
	 * @param cantidad
	 * @param fechaRegistro
	 * @param idEstudiante
	 * @param idMaterialReciclable
	 * @param idSede
	 */
	public MaterialxEstudiantexSede(int idMaterialxEstudiantexSede, double cantidad, Date fechaRegistro,
			Estudiante idEstudiante, MaterialReciclable idMaterialReciclable, Sede idSede) {
		this.idMaterialxEstudiantexSede = idMaterialxEstudiantexSede;
		Cantidad = cantidad;
		FechaRegistro = fechaRegistro;
		this.idEstudiante = idEstudiante;
		this.idMaterialReciclable = idMaterialReciclable;
		this.idSede = idSede;
	}

	/**
	 * @return the idMaterialxEstudiantexSede
	 */
	public int getIdMaterialxEstudiantexSede() {
		return idMaterialxEstudiantexSede;
	}

	/**
	 * @param idMaterialxEstudiantexSede the idMaterialxEstudiantexSede to set
	 */
	public void setIdMaterialxEstudiantexSede(int idMaterialxEstudiantexSede) {
		this.idMaterialxEstudiantexSede = idMaterialxEstudiantexSede;
	}

	/**
	 * @return the cantidad
	 */
	public double getCantidad() {
		return Cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
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
	 * @return the idEstudiante
	 */
	public Estudiante getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * @param idEstudiante the idEstudiante to set
	 */
	public void setIdEstudiante(Estudiante idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/**
	 * @return the idMaterialReciclable
	 */
	public MaterialReciclable getIdMaterialReciclable() {
		return idMaterialReciclable;
	}

	/**
	 * @param idMaterialReciclable the idMaterialReciclable to set
	 */
	public void setIdMaterialReciclable(MaterialReciclable idMaterialReciclable) {
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/**
	 * @return the idSede
	 */
	public Sede getIdSede() {
		return idSede;
	}

	/**
	 * @param idSede the idSede to set
	 */
	public void setIdSede(Sede idSede) {
		this.idSede = idSede;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MaterialxEstudiantexSede [idMaterialxEstudiantexSede=" + idMaterialxEstudiantexSede + ", Cantidad="
				+ Cantidad + ", FechaRegistro=" + FechaRegistro + ", idEstudiante=" + idEstudiante
				+ ", idMaterialReciclable=" + idMaterialReciclable + ", idSede=" + idSede + "]";
	}

}
