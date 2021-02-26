package com.bankele.PDBuilder;

/*Clase director*/

public class PuestodeTacos {
	private TacosBuilder tacosBuilder;
	
	public void setTacosBuilder(TacosBuilder tb) {
		tacosBuilder = tb;
	}
	
	public Tacos getTacos() {
		return tacosBuilder.getTacos();
	}
	
	public void armarTacos() {
		tacosBuilder.hacerTacos();
		tacosBuilder.buildTortilla();
		tacosBuilder.buildCarne();
		tacosBuilder.buildVerdura();
		tacosBuilder.buildSalsa();
	}
}
