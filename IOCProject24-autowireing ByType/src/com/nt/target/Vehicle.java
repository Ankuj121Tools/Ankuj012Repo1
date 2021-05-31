package com.nt.target;

import com.nt.car.CNGEngine;
import com.nt.car.DieselEngine;
import com.nt.car.Iengine;
import com.nt.car.PetrolEngine;

public class Vehicle {
     public Iengine cngg;
     
     
     
    public Vehicle() {
		System.out.println("0-param constructor Vehicle");
	}


	public void  setcngg(Iengine cngg){
    	 this.cngg=cngg;
    }
    
    
     public void move(String source,String dest) {
    	  cngg.start();
    	  System.out.println("vehicle starts from "+source);
    	  cngg.stop();
    	  System.out.println("vehicle stop from "+dest);
    	 
     }
}
