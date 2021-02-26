package com.bankele.PDBuilder;

//Abstract builder

public abstract class TacosBuilder {
	protected Tacos tacos;
	
	public Tacos getTacos() {
		return tacos;
	}
	
	public void hacerTacos() {
		tacos = new Tacos();
	}
	
	public abstract void buildTortilla();
	public abstract void buildCarne();
	public abstract void buildVerdura();
	public abstract void buildSalsa();
}
