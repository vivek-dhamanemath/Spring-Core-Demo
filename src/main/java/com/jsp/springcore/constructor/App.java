package com.jsp.springcore.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {
	
	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("springConstructor.xml"));
		
		Car car = bf.getBean(Car.class);
		System.out.println(car);
		
	}
}
