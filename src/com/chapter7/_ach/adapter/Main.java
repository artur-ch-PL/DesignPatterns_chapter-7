package com.chapter7._ach.adapter;

public class Main {

	public static void main(String[] args) {
		IMidfielder currentMidfielder = new AttackingMidfielder("Ozil");
		IStriker currentStriker = new MidfielderToStrikerAdapter(currentMidfielder);
		
		System.out.println("Curent player is " + currentMidfielder.getName());
		currentStriker.reception();
		currentStriker.reception();
		currentStriker.shot();
		
		currentStriker = new StrikerTypicall11("Giroud");
		System.out.println("Ball gets to another player named " + currentStriker.getName());
		currentStriker.shot();
		currentMidfielder = new StrikerToMidfielderAdapter(currentStriker);
		currentMidfielder.tackle();
		currentMidfielder.pass();
		currentMidfielder.strike();
	}

}
