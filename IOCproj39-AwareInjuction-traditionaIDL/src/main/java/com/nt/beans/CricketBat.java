package com.nt.beans;

import java.util.Random;

public class CricketBat {

	public CricketBat(){
		System.out.println("Cricketer bat::0-param constructor");
		
	}
	public int scoreRuns() {
		System.out.println("CricketBat.scoreRuns()");
		return new Random().nextInt(264);
	}
}
