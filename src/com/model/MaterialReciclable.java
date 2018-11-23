package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MaterialReciclable")
public class MaterialReciclable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMaterialReciclable")
	private int idMaterialReciclable;
	
	@Column(name = "Material")
	private String Material;
	
	public MaterialReciclable() {
	
	}

	/**
	 * @param idMaterialReciclable
	 * @param material
	 */
	public MaterialReciclable(int idMaterialReciclable, String material) {
		this.idMaterialReciclable = idMaterialReciclable;
		Material = material;
	}

	/**
	 * @return the idMaterialReciclable
	 */
	public int getIdMaterialReciclable() {
		return idMaterialReciclable;
	}

	/**
	 * @param idMaterialReciclable the idMaterialReciclable to set
	 */
	public void setIdMaterialReciclable(int idMaterialReciclable) {
		this.idMaterialReciclable = idMaterialReciclable;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return Material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		Material = material;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MaterialReciclable [idMaterialReciclable=" + idMaterialReciclable + ", Material=" + Material + "]";
	}
	

}
