package com.Dec15MethodOverloading;

public class Polymorphism_ChildClass extends Polymorphism_Parentclass {
	String name = "GaneshaNilayam";
	String HouseType = "3bhk";
	void newHouse() {
		super.car();
		super.bike("Duke");
		//bike("Duke");
		System.out.println(super.name);
		System.out.println(super.HouseType);
		System.out.println(name);
		System.out.println(this.HouseType);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_ChildClass  obj = new Polymorphism_ChildClass();
		obj.newHouse();
		obj.newcar();
		
	}
	Polymorphism_ChildClass(){
		System.out.println("i am shiva's child Ganesha");
	}
void newcar() {
	System.out.println("new model car is tatamanza");
}

}
