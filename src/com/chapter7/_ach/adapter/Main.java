package com.chapter7._ach.adapter;

public class Main {

	public static void main(String[] args) {
		IMidfielder currentMidfielder = new AttackingMidfielder("Zidane");
		IStriker currentStriker = new MidfielderAdapter(currentMidfielder);
		
		currentStriker.shot();
		
		currentStriker = new StrikerTypicall11("Ibrahimovic");
		currentStriker.shot();
		
		currentMidfielder = new StrikerToMidfielderAdapter(currentStriker);
		currentMidfielder.pass();
		currentMidfielder.strike();
	}

}
