package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
    @Autowired
    @Qualifier("dhl")
	private Courier courier;
    
    public Flipkart() {
    	System.out.println("0-param const of flipkart");
    }
    
    public String shopping(String []items,float [] price) {
    	float bilamt=0.0f;
    	for(float p:price) {
    		bilamt=bilamt+p;
    	}
    	String msg=courier.deliver(new Random().nextInt(100));
    	String finalMess=Arrays.toString(items)+" are Shopped haveing price is "+Arrays.toString(price)+" with bill amount is "+bilamt+" order id is "+msg;
    	return finalMess;
    }
}
