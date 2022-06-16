package week1.Day2.assignment;

public class Twowheeler {
	
 public int noOfWheels() {
	 int numberOfwheels=2;
	 return numberOfwheels;}

 public short noOfMirrors() {
	 short numberOfMirrors=2;
	 return numberOfMirrors;}
 
 public long chassisNumber() {
	 long chassisNumbers = 54899544885486L;
	 return chassisNumbers;} 
 
 public boolean isPuncture1() {
	 boolean yes = false;
 	return false;}

 public boolean isPuncture() {
	 boolean no = true;
 	return true;}
 
 public String bikeName() {
	 String bike="activa";
	 return bike;}
 
 public double runningKM() {
 	double runKm=85427.56;
 	return runKm;}
 
 
 public static void main (String[] args) {
	 
	 Twowheeler bikes = new Twowheeler();
	 
	 System.out.println(bikes.noOfWheels());
	 System.out.println(bikes.noOfMirrors());
	 System.out.println(bikes.chassisNumber());
	 System.out.println(bikes.isPuncture1());
	 System.out.println(bikes.isPuncture());
	 System.out.println(bikes.bikeName());
	 System.out.println(bikes.runningKM());
 }
}

