package com.bankele.PDBuilder;

/*Clase principal*/

public class Main {

	public static void main(String[] args) {
		PuestodeTacos puestoDeTacos = new PuestodeTacos();//Clase director
		TacosBuilder tacoPastor = new TacoAlPastorBuilder();
		TacosBuilder salsaEnTacos = new SalsaTacosBuilder();
		
		puestoDeTacos.setTacosBuilder(tacoPastor);
		puestoDeTacos.armarTacos();
		
		Tacos tacos = puestoDeTacos.getTacos();
		
	}

}
