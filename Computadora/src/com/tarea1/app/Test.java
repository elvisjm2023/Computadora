package com.tarea1.app;

public class Test {
    public static void main(String[] args) {
    	portatil portatil = new portatil("Dell", "Inspiron", 8, 256, true);
    	System.out.println("Portatil: " + portatil.getMarca() + ", " + portatil.getModelo() + ", RAM: " + portatil.getMemoriaRam() + "GB, Almacenamiento: " + portatil.getAlmacenamiento() + "GB, Tiene batería: " + portatil.isTieneBateria());

    	escritorio escritorio = new escritorio("Apple", "iMac", 16, 512, true);
    	System.out.println("Escritorio: " + escritorio.getMarca() + ", " + escritorio.getModelo() + ", RAM: " + escritorio.getMemoriaRam() + "GB, Almacenamiento: " + escritorio.getAlmacenamiento() + "GB, Tiene monitor: " + escritorio.isTieneMonitor());

    }
}
