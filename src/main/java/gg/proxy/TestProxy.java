package gg.proxy;


public class TestProxy {

	public static void main(String[] args) {
//		Hello hello = new MyHello();
//		hello.sayHello("hello");
//		MyHelloProxy proxy = new MyHelloProxy();
//		proxy.setTarget(hello);
//		Hello myProxy = (Hello)proxy.createProxy();
//		myProxy.sayHello("hello");
		MyHelloProxy2 proxy = new MyHelloProxy2();
		Hello myProxy = (Hello)proxy.createProxy();
		myProxy.sayHello("hello world");
		
	}
}
