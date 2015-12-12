package com.aricode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aricode.beans.Mundo;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/aricode/xml/beans.xml");
		Mundo m=(Mundo)appContext.getBean("mundo");
		//Mundo m=appContext.getBean(Mundo.class);
		System.out.println("SALUDO >>> "+ m.getSaludo());

	}

}
