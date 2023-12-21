package com.Interface;

public interface library {
 abstract void books();
 abstract void records();
 abstract void academicbooks(); 

default void depts() {
	System.out.println("Departmentname is finance");
}
}
