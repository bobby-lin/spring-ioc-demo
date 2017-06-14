package com.bobby.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		// Create application context
		ApplicationContext cxt = new FileSystemXmlApplicationContext("/src/main/resources/beans-challenge.xml");
		
		// Create bean (POJO - Plain Old Java Object)
		City city = (City) cxt.getBean("City");
		
		// Invoke getCityName() method from City class
		city.printCityName();
		
		// Close the application context
		((FileSystemXmlApplicationContext) cxt).close();
	}

}
