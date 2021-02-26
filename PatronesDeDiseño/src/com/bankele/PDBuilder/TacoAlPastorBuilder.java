package com.bankele.PDBuilder;

/*Concrete builder*/

public class TacoAlPastorBuilder extends TacosBuilder {
	
	@Override
	public void buildTortilla() {
		tacos.setTortilla("Doble");
	}
	
	@Override
	public void buildCarne() {
		tacos.setCarne("Pastor");
	}
	
	@Override
	public void buildVerdura() {
		tacos.setVerdura("Con todo");
	}
	
	@Override
	public void buildSalsa() {
		tacos.setVerdura("Sin salsa");
	}
	
}
