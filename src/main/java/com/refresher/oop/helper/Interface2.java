package com.refresher.oop.helper;


/*
 * You can inherit a super-interface
 * This is now considered as sub-interface
 */
public interface Interface2 extends Interface1{
	public void swim(int num1, int num2);
	public void jump(int num1);
	
	public abstract void walk();
}
