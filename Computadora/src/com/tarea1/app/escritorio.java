package com.tarea1.app;

public class escritorio extends computadoras {

	  private boolean tieneMonitor;

	  public escritorio(String marca, String modelo, int memoriaRam, int almacenamiento, boolean tieneMonitor) {
	    super(marca, modelo, memoriaRam, almacenamiento);
	    this.tieneMonitor = tieneMonitor;
	  }

	  public boolean isTieneMonitor() {
	    return tieneMonitor;
	  }

	  public void setTieneMonitor(boolean tieneMonitor) {
	    this.tieneMonitor = tieneMonitor;
	  }

	}