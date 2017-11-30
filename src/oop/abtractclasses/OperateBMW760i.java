package oop.abtractclasses;

public class OperateBMW760i implements OperateCar {

	public OperateBMW760i() {
		// TODO Auto-generated constructor stub
	}
	Direction direction;
	@Override
	public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
		this.direction = direction;
		return 0;
	}

	@Override
	public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int signalTurn(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarFront(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarRear(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return direction;
	}

}
