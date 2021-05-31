package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.FacultyInfo;
import com.nt.beans.FruitStore;
import com.nt.beans.Student;

public class Test {

	public static void main(String[] args) {
		//create Ioc contaner
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		Student stu=factory.getBean("stud",Student.class);
		
		System.out.println(stu);
		System.out.println("--------------------------------------------------------------------------");
         
		FacultyInfo fac=factory.getBean("fac",FacultyInfo.class);
		System.out.println(fac);
		System.out.println("---------------------------------------------------------------------------");
	
		FruitStore store=factory.getBean("store",FruitStore.class);
	        System.out.println(store);
	}

}
