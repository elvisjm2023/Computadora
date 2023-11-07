package com.tarea1.app;

public class portatil extends computadoras {

	  private boolean tieneBateria;

	  public portatil(String marca, String modelo, int memoriaRam, int almacenamiento, boolean tieneBateria) {
	    super(marca, modelo, memoriaRam, almacenamiento);
	    this.tieneBateria = tieneBateria;
	  }

	  public boolean isTieneBateria() {
	    return tieneBateria;
	  }

	  public void setTieneBateria(boolean tieneBateria) {
	    this.tieneBateria = tieneBateria;
	  }

	}
