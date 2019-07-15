package com.refresher.oop.helper;

/*
 * Rules:
 * Once a class contains abstract method, the class should also be an abstract
 * Abstract methods must be implemented by a subclass (@Override)
 * Abstract class can implement an Interface
 * Abstract class can contain a non-abstract method (has a body)
 */
public abstract class AbstractClass1 {
	private String field1;
	public int field2;
	
	public abstract void method1();
	
	public String method2() {
		String str = "foo";
		return str;
	}
}
