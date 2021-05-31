package com.nt.vehiclefactory;

import com.nt.car.CNGEngine;
import com.nt.car.DieselEngine;
import com.nt.car.Iengine;
import com.nt.car.PetrolEngine;
import com.nt.target.Vehicle;

public class VehicleFactory {
	 
	
	public static Vehicle getInstance(String s) {
	 		Iengine ing;
	 		Vehicle vic=new Vehicle();
	 		if(s.equalsIgnoreCase("Petrol")){
	 			 ing=new PetrolEngine();
	 		}else if(s.equalsIgnoreCase("Diesel")){
	 		     ing=new DieselEngine();
	 		}else if(s.equalsIgnoreCase("cng")) {
	 			 ing=new CNGEngine();
	 		}else
	 			throw new IllegalArgumentException("Invalid Engine type");
	 		
	 		vic.setEngg(ing);
	 		return vic;
	 	}
}
