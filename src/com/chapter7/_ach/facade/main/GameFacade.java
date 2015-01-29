package com.chapter7._ach.facade.main;

import com.chapter7._ach.facade.classes.Defender;
import com.chapter7._ach.facade.classes.GoalKeeper;
import com.chapter7._ach.facade.classes.MiddleFender;
import com.chapter7._ach.facade.classes.Striker;

public class GameFacade {
	private GoalKeeper gk = new GoalKeeper();
	private Defender df = new Defender();
	private MiddleFender mf = new MiddleFender();
	private Striker sk = new Striker();
	
	
	GameFacade(GoalKeeper gk, Defender df, MiddleFender mf, Striker sk){
		this.gk = gk;
		this.df = df;
		this.mf = mf;
		this.sk = sk;
	}
	
	public void performTeamActionLongPass(){
		gk.passToDefender();
		df.passToMiddleFender();
		mf.passToDefender();
		df.longPassToStriker();
		sk.performShot();
	}
	
	public void performTeamActionMiddleLineAttack(){
		gk.passToDefender();
		df.passToMiddleFender();
		mf.passToAttacker();
		sk.performShot();
	}
}
