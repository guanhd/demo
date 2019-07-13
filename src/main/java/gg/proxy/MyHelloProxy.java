package gg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHelloProxy implements InvocationHandler{
	
	private Object target;

	
	/**
	 * @param target the target to set
	 */
	public void setTarget(Object target) {
		this.target = target;
	}



	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("-------proxy in-------");
		Object result = method.invoke(target, args);
		return result;
	}
	
	/**
	 * 获取代理类
	 * @return
	 * @author guanhd
	 */
	public Object createProxy() {
		ClassLoader classLoader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		InvocationHandler invocationHandler = this;
		Object cc = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		return cc;
	}
	
	
}
