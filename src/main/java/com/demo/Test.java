package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student student =(Student) context.getBean("stud");
		System.out.println(student);
				
		Resource resource = new ClassPathResource("Spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Student  student2 = (Student)beanFactory.getBean("stud");
		System.out.println("using resource");
		System.out.println(student2);
	}

}
