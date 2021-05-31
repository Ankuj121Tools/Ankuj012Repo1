package com.nt.beans;
import java.util.Date;

public class WishMessageGenerater{
   private Date date;
   
   public void setDate(Date date) {
	   System.out.println("setter injuction is executed");
	   this.date=date;
   }
  
   public String generateWishMessage(String user) {
	   System.out.println("WishMessageGenerater.generateWishMessage()");
	   int hour=date.getHours();
	   if(hour<12) {
		   return "Good Morning "+user;
	   }
	   else if(hour<16) {
		   return "Good AfterNoon "+user;
	   }else if(hour<20) {
		   return "Good Evening "+user;
	   }else
		   return "Good Night "+user;
	   
   }
}
