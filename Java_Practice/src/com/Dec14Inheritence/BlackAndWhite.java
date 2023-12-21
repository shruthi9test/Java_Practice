package com.Dec14Inheritence;

public class BlackAndWhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackAndWhite obj = new BlackAndWhite();
		obj.volume();
		obj.channelChange();
		obj.noofchannels(10);
		obj.display();
		System.out.println("Black and White tv is ready to use");	
		
	}
void volume() {
	System.out.println("Volume is Incresed and Decresed");
}
void channelChange() {
	System.out.println("channel change Buttons for up and down");
}
void noofchannels(int channels) {
	System.out.println("no of channels are: " + channels);

}
void display() {
	System.out.println("display is Black and white");
}

}
