package com.global;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee)context.getBean("emp");
//		emp.test();
		System.out.println("hi");
	}

}
