package com.refresher.oop;

import com.refresher.oop.helper.AbstractClass1;
import com.refresher.oop.helper.Interface1;

/* 
 * What is Abstraction?
 * It is about hiding of the implementation details from the users
 */

/*
 * How to achieve abstraction?
 * Through the use of Abstract Classes and Interfaces
 */

/*
 * Abstract Class VS Interfaces
 * In terms of method, abstract classes may contain non-abstract methods but interfaces can only have abstract methods
 * In terms of final variable, abstract class may contain non-final variable while variables declared in an interface are final by default
 * In terms of variable, abstract class can have final, non-final, static, and non-static variables
 * ... while in interface, final and static variables are the only allowed
 * In terms of implementation, abstract class can provide an implementation of an interface, while interface cannot provide imp. of abstract
 * In using, to inherit abstract class, you must use EXTENDS, in interface, you use IMPLEMENTS
 */

/*
 * Use Abstract Class when:
 * You want to share code among several closely related classes
 * You expect that classes that extend your abstract class have many common methods 
 * ... or fields or require access modifiers other than public (such as protected and private)
 * You want to declare non-static or non-final fields. This enables you to define methods 
 * ... that can access and modify the state of the object to which they belong
 */

// multiple inheritance is also considered as polymorphism/polymorphic
public class AbstractionClass extends AbstractClass1 implements Interface1{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
