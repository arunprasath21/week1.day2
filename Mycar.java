package week1.Day2.assignment;

public class Mycar {
 public static void main(String[] args) {
	 Car vehicle = new Car();
	 System.out.println(vehicle.applyBrake());
		//System.out.println(vehicle.applyGear());  //(this is created as private method)
		System.out.println(vehicle.switchOnAc());
		System.out.println(vehicle.applyAccelarator());
 }
}
