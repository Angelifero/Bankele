package com.bankele.PDFactory;

public class Automovil implements Transporte {

	@Override
	public void arrancar() {
		System.out.println("Arrancar automovil");
	}

	@Override
	public void detener() {
		System.out.println("Detener automovil");
	}

	@Override
	public String tipo() {
		return "Automovil";
	}

}
