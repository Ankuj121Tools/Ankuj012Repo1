package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerater;

public class Test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		WishMessageGenerater generater=factory.getBean("wmg",WishMessageGenerater.class);
		System.out.println(generater.generateWishMessage("Ankuj"));

	}

}
