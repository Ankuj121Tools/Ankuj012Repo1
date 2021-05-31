package com.nt.car;

public class PetrolEngine implements Iengine {
    
	public PetrolEngine() {
		System.out.println("0-param constructor");
	}
	@Override
	public void start() {
		   System.out.println("PetrolEngine.start()");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");

	}

}
