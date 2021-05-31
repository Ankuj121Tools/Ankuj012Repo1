package com.nt.target;

import com.nt.car.CNGEngine;
import com.nt.car.DieselEngine;
import com.nt.car.Iengine;
import com.nt.car.PetrolEngine;

public class Vehicle {
     public Iengine pngg;
     
     
     
    public Vehicle() {
		System.out.println("0-param constructor Vehicle");
	}


	public void  setPngg(Iengine pngg){
    	 this.pngg=pngg;
    }
    
    
     public void move(String source,String dest) {
    	  pngg.start();
    	  System.out.println("vehicle starts from "+source);
    	  pngg.stop();
    	  System.out.println("vehicle stop from "+dest);
    	 
     }
}
