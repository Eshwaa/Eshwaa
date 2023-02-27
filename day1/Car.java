package week2.day1;

public class Car {
	public void startCar() {
		System.out.println("turn on the car");
	}
	public void stopCar() {
		System.out.println("turn off the car");
	}	
	public void applyBreak() {
		System.out.println("put the break");
	}
	public void applyGear() {
		System.out.println("change the gear");
	}
	public void swichOnAc() {
		System.out.println("turn on the Ac");
	}
	public void applyAcclerate() {
		System.out.println("apply the acclerate");
	}
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.startCar();
		mycar.stopCar();
		mycar.applyBreak();
		mycar.applyGear();
		mycar.applyAcclerate();
		mycar.swichOnAc();
	}
	
}
