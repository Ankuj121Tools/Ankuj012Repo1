package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.B;

public class test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC contaner
		XmlBeanFactory factory=new XmlBeanFactory(res);
	//	A a=factory.getBean("a",A.class);
		B b=factory.getBean("b",B.class);

	}

}
