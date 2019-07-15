package com.refresher.oop.helper;

/*
 * Rules:
 * Interfaces can only have abstract methods (has no body), static, default, and final variables
 * Interfaces cannot have a constructor
 * Interfaces cannot extend/inherit Abstract Classes since those classes can contain non-abstract methods
 * Interfaces can have variables/fields that are final by default
 */
public interface Interface1 {
	int num = 5;
	public abstract void walk();
}
