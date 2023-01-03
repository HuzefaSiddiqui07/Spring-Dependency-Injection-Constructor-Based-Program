package com.springframework.applicationcontext.constructortype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Employee employee = (Employee) applicationContext.getBean("Huzefa");

		System.out.println("Employee Details > " + employee);

	}

}
