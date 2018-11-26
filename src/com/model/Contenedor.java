package com.model;

public class Contenedor {

	private String data;
	
	public Contenedor(){
		
		
	}

	/**
	 * @param data
	 */
	public Contenedor(String data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contenedor [data=" + data + "]";
	}
	
}
