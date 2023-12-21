package com.Dec14Inheritence;

public class LCDTV_MULTILEVEL extends ColorTv{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCDTV_MULTILEVEL obj = new LCDTV_MULTILEVEL();
		obj.channelChange();
		obj.display();
		obj.remote();
		obj.volume();
		obj.noofchannels(1000);
		obj.Woofer();
		System.out.println("New Lcd Tv is ready to use");
	}
 void Woofer() {
	 System.out.println("advanced soundsystem added");
 }
}
