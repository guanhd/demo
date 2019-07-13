package gg.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	    // 1������ Spring �� IOC �������� 
	    ApplicationContext ioc = new ClassPathXmlApplicationContext("SpringAOP.xml");
	    // 2���� IOC �����л�ȡ bean ʵ�� 
	    HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
	    // 3������ hello����
	    helloWorld.hello();
	}
}

