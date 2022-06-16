package week1.Day2.assignment;

public class Car {

	public boolean applyBrake () {
		return false;}
	
	private int applyGear () {
		int gear = 2;
		return gear;}
	
	public String switchOnAc () {
		String ac = "on";
		return ac;}
	
	public String applyAccelarator() {
		String acc = "notdone";
		return acc;}
		
	public static void main (String[] args) {
	
		Car vehicle = new Car();
	
	System.out.println(vehicle.applyBrake());
	System.out.println(vehicle.applyGear());
	System.out.println(vehicle.switchOnAc());
	System.out.println(vehicle.applyAccelarator());

}
}