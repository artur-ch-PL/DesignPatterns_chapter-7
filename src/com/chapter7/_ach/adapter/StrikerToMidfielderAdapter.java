package com.chapter7._ach.adapter;

public class StrikerToMidfielderAdapter implements IMidfielder {
	String name;
	IStriker striker;
	
	public StrikerToMidfielderAdapter(IStriker striker) {
		this.striker = striker;
		this.name = striker.getName();
	}
	
	@Override
	public void pass() {
		System.out.println(getName() + " wait a while, make some trick, and pass to other player");
	}

	@Override
	public void tackle() {
		System.out.println(getName() + " definitly should try tackle");
	}

	@Override
	public void strike() {
		striker.shot();
	}

	@Override
	public String getName() {
		return name;
	}

}
