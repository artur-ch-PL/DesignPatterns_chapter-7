package com.chapter7._ach.facade.main;

import com.chapter7._ach.facade.classes.Defender;
import com.chapter7._ach.facade.classes.GoalKeeper;
import com.chapter7._ach.facade.classes.MiddleFender;
import com.chapter7._ach.facade.classes.Striker;

public class Main {

	public static void main(String[] args) {
		GoalKeeper gk = new GoalKeeper();
		Defender df = new Defender();
		MiddleFender mf = new MiddleFender();
		Striker sk = new Striker();
		
		GameFacade gameFacade = new GameFacade(gk, df, mf, sk);
		gameFacade.performTeamActionLongPass();
		gameFacade.performTeamActionMiddleLineAttack();
	}

}
