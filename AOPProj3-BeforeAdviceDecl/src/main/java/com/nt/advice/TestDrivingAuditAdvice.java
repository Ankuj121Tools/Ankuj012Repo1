package com.nt.advice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class TestDrivingAuditAdvice {

  public void testDrive(JoinPoint jp) throws IOException
  {
	  System.out.println("BeforeAdvice.testDrive()");
	  Object [] args=jp.getArgs();
	  String msg=args[0]+" customer  has come for testing driving of "+args[1]+" model car on  "+new Date();
	  Writer wrt=new FileWriter("e:\\testdrive_audit.txt",true);
	  wrt.write(msg+"\n");
	  wrt.flush();
	  wrt.close();
  }
}
