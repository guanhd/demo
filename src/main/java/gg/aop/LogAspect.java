package gg.aop;


public class LogAspect {
	public void beforeExecute() {
		System.out.println("--------beforeExecute-----");
	}
	public void afterExecute() {
		System.out.println("--------afterExecute-----");
	}
}
