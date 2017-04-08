package com.chapter7._ach.facade.classes;

public class GameFacade {
	private GoalKeeper goalKeeper = new GoalKeeper();
	private Defender defender = new Defender();
	private MiddleFender mmiddleFender = new MiddleFender();
	private Striker striker = new Striker();
	
	
	GameFacade(GoalKeeper gk, Defender df, MiddleFender mf, Striker sk){
		this.goalKeeper = gk;
		this.defender = df;
		this.mmiddleFender = mf;
		this.striker = sk;
	}
	
	public void performTeamActionLongPass(){
		goalKeeper.passToDefender();
		defender.passToMiddleFender();
		mmiddleFender.passToDefender();
		defender.longPassToStriker();
		striker.performShot();
	}
	
	public void performTeamActionMiddleLineAttack(){
		goalKeeper.passToDefender();
		defender.passToMiddleFender();
		mmiddleFender.passToAttacker();
		striker.performShot();
	}
}
