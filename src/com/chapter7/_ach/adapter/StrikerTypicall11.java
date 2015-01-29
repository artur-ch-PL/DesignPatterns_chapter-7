package com.chapter7._ach.adapter;

public class StrikerTypicall11 implements IStriker{
	private String name;
	
	public StrikerTypicall11(String name) {
		this.name = name;
	}
	
	@Override
	public void shot() {
		System.out.println("Strong shot from the box by " + name);
	}

	@Override
	public void reception() {
		System.out.println("Qucik receipt and shot by " + name);
	}

	@Override
	public String getName() {
		return name;
	}

}
