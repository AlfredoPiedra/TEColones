package com.model;

/**
 * Clase utilizada para los Jsp, retorna objeto lista
 */
public class Contenedor {

	private String data;
	
	
	/**
	 * Constructor de Contenedor
	 */
	public Contenedor(){
		
		
	}

	/**
	 * Constructor de Contenedor
	 * @param data
	 */
	public Contenedor(String data) {
		this.data = data;
	}

	/**
	 * getter de data
	 * @return data
	 */
	public String getData() {
		return data;
	}

	/**
	 * setter de data
	 * @param data
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
