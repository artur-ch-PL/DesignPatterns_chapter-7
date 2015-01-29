package com.chapter7._ach.adapter;

public class MidfielderAdapter implements IStriker {
	IMidfielder middleFender;
	String name;
	
	public MidfielderAdapter(IMidfielder mf) {
		this.middleFender = mf;
		name = mf.getName();
	}
	
	@Override
	public void shot() {
		System.out.println(name + " perform technique shot");
	}

	@Override
	public void reception() {
		System.out.println("Short cover, recipe ball and pass to MF");
	}

	@Override
	public String getName() {
		return name;
	}

}
