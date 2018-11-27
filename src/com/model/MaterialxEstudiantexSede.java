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
 * Entity
 *@Table(name = "MaterialxEstudiantexSede")
 */
public class MaterialxEstudiantexSede {

	/**
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * @Column(name = "idMaterialxEstudiantexSede")
	 */
	private int idMaterialxEstudiantexSede;
	
	/**
	 * @Column(name = "Cantidad")
	 */
	private double Cantidad;
	
	/**
	 * @Temporal(TemporalType.DATE)
	 * @Column(name = "FechaRegistro")
	 */
	private Date FechaRegistro;
	
	
	/**
	 * @OneToOne
	 *@JoinColumn(name = "Estudiante_idEstudiante")
	 */ 
	private Estudiante idEstudiante;
	
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "MaterialReciclable_idMaterialReciclable")
	 */
	private MaterialReciclable idMaterialReciclable;
	
	
	/**
	 * @OneToOne
	 * @JoinColumn(name = "Sede_idSede")
	 */
	private Sede idSede;
	
	public MaterialxEstudiantexSede() {
		
	}

	/**
	 * Constructor de idMaterialxEstudiantexSede
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
	 * getter de idMaterialxEstudiantexSede
	 * @return the idMaterialxEstudiantexSede
	 */
	public int getIdMaterialxEstudiantexSede() {
		return idMaterialxEstudiantexSede;
	}

	/**
	 * setter de idMaterialxEstudiantexSede
	 * @param idMaterialxEstudiantexSede the idMaterialxEstudiantexSede to set
	 */
	public void setIdMaterialxEstudiantexSede(int idMaterialxEstudiantexSede) {
		this.idMaterialxEstudiantexSede = idMaterialxEstudiantexSede;
	}

	/**
	 * getter de cantidad
	 * @return cantidad
	 */
	public double getCantidad() {
		return Cantidad;
	}

	/**
	 * setter de cantidad
	 * @param cantidad
	 */
	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
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
	 * getter de idEstudiante
	 * @return idEstudiante
	 */
	public Estudiante getIdEstudiante() {
		return idEstudiante;
	}

	/**
	 * setter de idEstudiante
	 * @param idEstudiante
	 */
	public void setIdEstudiante(Estudiante idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/**
	 * getter de idMaterialReciclable
	 * @return idMaterialReciclable
	 */
	public MaterialReciclable getIdMaterialReciclable() {
		return idMaterialReciclable;
	}

	/**
	 * setter de idMaterialReciclable
	 * @param idMaterialReciclable the idMaterialReciclable to set
	 */
	public void setIdMaterialReciclable(MaterialReciclable idMaterialReciclable) {
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/**
	 * getter de idSede
	 * @return idSede
	 */
	public Sede getIdSede() {
		return idSede;
	}

	/**
	 * setter de idSede
	 * @param idSede
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
