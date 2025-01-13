package com.jsp.springcore.DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.jsp.springcore.Student;

public class App {
	
	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("springDI.xml"));
		
		Car car = (Car) bf.getBean("car-bean");
		System.out.println(car);
		System.out.println(bf.getBean(Engine.class));
		
		
	}
}
