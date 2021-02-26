package com.bankele.PDFactory;

public class Moto implements Transporte{

	@Override
	public void arrancar() {
		System.out.println("Arrancar Moto");
	}

	@Override
	public void detener() {
		System.out.println("Detener moto");
	}

	@Override
	public String tipo() {
		return "Moto";
	}

}
