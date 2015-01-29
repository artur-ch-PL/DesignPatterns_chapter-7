package com.chapter7._ach.adapter;

public class AttackingMidfielder implements IMidfielder {
	private String name;
	
	public AttackingMidfielder(String name) {
		this.name = name;
	}
	
	@Override
	public void pass() {
		System.out.println("Perform quick one-touch passes");
	}

	@Override
	public void tackle() {
		System.out.println("Tackle now!");
	}

	@Override
	public void strike() {
		System.out.println("Strike out of the box");
	}

	@Override
	public String getName() {
		return name;
	}

}
