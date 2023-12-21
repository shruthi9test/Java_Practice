package com.Dec14Inheritence;

public class ColorTv extends BlackAndWhite{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTv obj = new ColorTv();
		obj.channelChange();
		obj.noofchannels(100);
		obj.volume();
		obj.display2();
		obj.remote();
		System.out.println("color tv is ready to use");
	}
	/*void noofchannels(int channels) {
		System.out.println("no of channels are: " + channels);

	}*/
void remote() {
	System.out.println("remote is Available");
}
void display2() {
	System.out.println("display is Color");
}

}
