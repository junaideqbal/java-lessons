package oop.inheritance;

public class Main {

	public static void main(String[] args) {
		MountainBike mBike = new MountainBike( 3, 2, 10, 1);
		System.out.println(mBike.toString());
		mBike.nosSpeedUp(10);
		System.out.println(mBike.toString());
	}

}
