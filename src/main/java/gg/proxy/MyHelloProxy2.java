package gg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHelloProxy2 implements InvocationHandler{
	

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("-------proxy2 in-------");
//		Object result = method.invoke(target, args);
		System.out.println("-------invoke owner method-------");
		return null;
	}
	
	/**
	 * 获取代理类
	 * @return
	 * @author guanhd
	 */
	public Object createProxy() {
		ClassLoader classLoader = Hello.class.getClassLoader();
		Class<?>[] interfaces = new Class[] { Hello.class };
		InvocationHandler invocationHandler = this;
		Object cc = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		return cc;
	}
	
	
}
