package com.nt.car;

public class CNGEngine implements Iengine {

	public CNGEngine() {
		System.out.println("0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("CNGEngine.start()");

	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()");

	}

}
