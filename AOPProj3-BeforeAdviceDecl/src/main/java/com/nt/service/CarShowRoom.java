package com.nt.service;

public class CarShowRoom {
	
	public String sellCar(String custName,String carModel,float price)
	{
		System.out.println("CarShowRoom.sellCar()");
		if(carModel.equalsIgnoreCase("Baleno"))
			return "Car "+carModel +" is sold out at price ::"+price+" to customer ::"+custName;
		else
			return carModel+" car is not for Sell";
	}

}
