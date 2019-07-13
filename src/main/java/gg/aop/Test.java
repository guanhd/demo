package gg.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	    // 1、创建 Spring 的 IOC 容器对象 
	    ApplicationContext ioc = new ClassPathXmlApplicationContext("SpringAOP.xml");
	    // 2、从 IOC 容器中获取 bean 实例 
	    HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
	    // 3、调用 hello方法
	    helloWorld.hello();
	}
}

