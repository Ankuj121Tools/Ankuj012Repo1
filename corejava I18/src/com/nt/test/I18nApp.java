package com.nt.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nApp {
   
	public static void main(String[] args) {
		Locale local=new Locale(args[0],args[1]);
		ResourceBundle bundle=ResourceBundle.getBundle("com/nt/commons/App",local);
		System.out.println(bundle.getString("wishMsg")+"    "+bundle.getString("welcome.msg")+"   "+bundle.getString("bye.msg"));
	}
}
