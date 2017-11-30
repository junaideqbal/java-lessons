package oop.abtractclasses;

import oop.abtractclasses.OperateCar.Direction;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		OperateBMW760i bmw = new OperateBMW760i();
		bmw.setDirection(Direction.Left);
		System.out.println(bmw.getDirection());
		
		
	}

}
