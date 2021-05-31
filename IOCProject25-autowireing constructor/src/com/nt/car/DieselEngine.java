package com.nt.car;

public class DieselEngine implements Iengine {
	
	public DieselEngine() {
		System.out.println("0-param constructor diesel");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine.start()");

	}

	@Override
	public void stop() {
		 System.out.println("DieselEngine.stop()");

	}

}
