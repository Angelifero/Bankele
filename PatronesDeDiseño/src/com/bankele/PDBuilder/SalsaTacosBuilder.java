package com.bankele.PDBuilder;

/*Concrete builder*/

public class SalsaTacosBuilder extends TacosBuilder{
	@Override
	public void buildTortilla() {
		tacos.setTortilla("Una");
	}
	
	@Override
	public void buildCarne() {
		tacos.setCarne("Suadero + quesillo");
	}
	
	@Override
	public void buildVerdura() {
		tacos.setVerdura("Cilantro");
	}
	
	@Override
	public void buildSalsa() {
		tacos.setVerdura("Salsa Verde");
	}
}
