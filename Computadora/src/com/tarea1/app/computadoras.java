package com.tarea1.app;

public abstract class computadoras {

	  private String marca;
	  private String modelo;
	  private int memoriaRam;
	  private int almacenamiento;

	  public computadoras(String marca, String modelo, int memoriaRam, int almacenamiento) {
	    this.marca = marca;
	    this.modelo = modelo;
	    this.memoriaRam = memoriaRam;
	    this.almacenamiento = almacenamiento;
	  }

	  public String getMarca() {
	    return marca;
	  }

	  public void setMarca(String marca) {
	    this.marca = marca;
	  }

	  public String getModelo() {
	    return modelo;
	  }

	  public void setModelo(String modelo) {
	    this.modelo = modelo;
	  }

	  public int getMemoriaRam() {
	    return memoriaRam;
	  }

	  public void setMemoriaRam(int memoriaRam) {
	    this.memoriaRam = memoriaRam;
	  }

	  public int getAlmacenamiento() {
	    return almacenamiento;
	  }

	  public void setAlmacenamiento(int almacenamiento) {
	    this.almacenamiento = almacenamiento;
	  }

	}
