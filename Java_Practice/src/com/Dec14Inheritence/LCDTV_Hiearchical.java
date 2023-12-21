package com.Dec14Inheritence;

public class LCDTV_Hiearchical extends BlackAndWhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCDTV_Hiearchical obj = new LCDTV_Hiearchical();
		obj.channelChange();
		obj.noofchannels(1000);
		obj.remote();
		obj.woofer();
		obj.volume();
		obj.display();
		System.out.println("Lcd Tv ready to use");
	}
		void woofer() {
		System.out.println("sound system woofer is added");
	}
		void remote() {
			System.out.println("remote is Available");
		}

}
