package com.chapter7._ach.facade.classes;

public class Main {

	public static void main(String[] args) {
		GoalKeeper goalKeeper = new GoalKeeper();
		Defender defender = new Defender();
		MiddleFender middleFender = new MiddleFender();
		Striker striker = new Striker();
		
		GameFacade gameFacade = new GameFacade(goalKeeper, defender, middleFender, striker);
		gameFacade.performTeamActionLongPass();
		gameFacade.performTeamActionMiddleLineAttack();
	}

}
