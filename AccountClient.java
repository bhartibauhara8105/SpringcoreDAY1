package com.niit.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountClient {
	public static void main(String []args)
	{
ApplicationContext context=new ClassPathXmlApplicationContext("account.xml");
UserAccountService uas=(UserAccountService)context.getBean("userAccountService");
	
	System.out.println("User Name :"+uas.getName());
	System.out.println("User Description :"+uas.getDescription());
	System.out.println("User Detials :"+uas.getDetails());
	}
	
}
