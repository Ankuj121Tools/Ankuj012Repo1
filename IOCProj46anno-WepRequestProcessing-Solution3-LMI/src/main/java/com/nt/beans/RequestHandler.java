package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("req")
@Scope("prototype")
public class RequestHandler {
   static private int count;

   public RequestHandler() {
	   ++count;
	System.out.println("RequestHandler  0-paramConstructor "+count);
	
   }
   public void processingRequest(String data) {
	   
		System.out.println("RequestHandler :: processing the request  with ::"+data+"---->"+this.hashCode()+"..."+count);

   }
   
   
}
