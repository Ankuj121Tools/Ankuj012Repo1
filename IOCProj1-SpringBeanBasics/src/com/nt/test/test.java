package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC contaner
		XmlBeanFactory factory=new XmlBeanFactory(res);
		WelcomeGreetings greetings=(WelcomeGreetings)factory.getBean("wsg");
		System.out.println(greetings.genrateWishMessage("Ankuj"));

	}

}
