package com.example.demo.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime sysDateTime;
	
	public String generateWishmessage(String user) {
	  int hour=sysDateTime.getHour()+1;
		if(hour<12)
		    return "GoodMorning"+user;
		else if(hour<16)
		    return "Goodafternoon"+user;
		else if(hour<20)
		    return "GoodEvening"+user;
		else
			return "GoodNight"+user;
	}
	
}
