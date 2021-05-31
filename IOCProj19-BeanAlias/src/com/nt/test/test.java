package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC contaner
		XmlBeanFactory factory=new XmlBeanFactory(res);
		WelcomeGreetings greetings=factory.getBean("wg",WelcomeGreetings.class);
		WelcomeGreetings greetings1=factory.getBean("welcomegreeting",WelcomeGreetings.class);
		System.out.println(greetings.hashCode()+"  "+greetings1.hashCode());
		System.out.println(greetings.genrateWishMessage("Ankuj"));

	}

}
