package com.nt.target;

import com.nt.car.CNGEngine;
import com.nt.car.DieselEngine;
import com.nt.car.Iengine;
import com.nt.car.PetrolEngine;

public class Vehicle {
     public Iengine eng;
     
    public Iengine setEngg(Iengine eng) {
    	return this.eng=eng;
    	
    	
    }
     public void move(String source,String dest) {
    	  eng.start();
    	  System.out.println("vehicle starts from "+source);
    	  eng.stop();
    	  System.out.println("vehicle stop from "+dest);
    	 
     }
}
