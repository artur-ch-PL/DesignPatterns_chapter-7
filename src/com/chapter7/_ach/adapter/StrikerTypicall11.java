package com.chapter7._ach.adapter;

public class StrikerTypicall11 implements IStriker{
	private String name;
	
	public StrikerTypicall11(String name) {
		this.name = name;
	}
	
	@Override
	public void shot() {
		System.out.println("Instead of pass, strong shot from out of the box by " + name);
	}

	@Override
	public void reception() {
		System.out.println("Qucik receipt and power shot by " + name);
	}

	@Override
	public String getName() {
		return name;
	}

}
