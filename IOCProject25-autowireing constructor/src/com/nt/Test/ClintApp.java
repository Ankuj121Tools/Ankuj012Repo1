package com.nt.Test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.target.Vehicle;


public class ClintApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        Vehicle vac= factory.getBean("vehicle",Vehicle.class);
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter From City name");
        String source=scr.nextLine();
        System.out.println("Enter Destination City name");
        String destination=scr.nextLine();
        vac.move(source,destination);
	}

}
