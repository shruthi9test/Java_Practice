package com.Interface;

public interface Faculty extends library,Book{
 /*100% abstraction achieved. here abstract methods and default methods allowed */ 
	abstract void dept();
	default void salary() {
		System.out.println("i am from default method");
	}
	
}
