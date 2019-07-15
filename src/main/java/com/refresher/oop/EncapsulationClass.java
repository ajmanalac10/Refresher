package com.refresher.oop;

/* 
 * What is Encapsulation? 
 * It is a mechanism of wrapping of data (variables) and code acting on the data (methods) together as a single unit.
 * Binding of data and functions to keep both safe from outside interference
 */

/* 
 * To achieve encapsulation:
 * Variables must be hidden (private)
 * Create public getters and setters(void) for each variable to modify and view the variable values
 */

public class EncapsulationClass {
	private String username;
	private String password;
	private String name;
	private int number;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
