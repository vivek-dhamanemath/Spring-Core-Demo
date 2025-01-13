package com.jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	//1st way
    	Student student = bf.getBean(Student.class);
    	System.out.println(student);
    	student.work();
    	
    	//2nd way
    	Student student2 = (Student)bf.getBean("student-bean");
    	System.out.println(student2);
    	student.work();
    	
    }
}
