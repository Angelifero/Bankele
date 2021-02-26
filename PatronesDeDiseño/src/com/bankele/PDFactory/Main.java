package com.bankele.PDFactory;

public class Main {

	public static void main(String[] args) {
		Transporte t1 = Fabrica.construir("Automovil");
		
		t1.arrancar();
		t1.detener();
		
		System.out.println("El tipo es: " + t1.tipo());
	}

}
