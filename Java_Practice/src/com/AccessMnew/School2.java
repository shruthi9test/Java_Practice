package com.AccessMnew;

import com.AccessModifiers.Student;

public class School2 extends Student { /*
										 * In outside Package protected accessed by extending the class only
										 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School2 obj = new School2();
		Student obj2 = new Student();
		obj2.display();
		obj.disprank();
		obj.marks();
		System.out.println(obj2.address); 
		System.out.println(obj.rank);
	}

}
