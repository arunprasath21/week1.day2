package week1.Day2.assignment;

public class EmployeeDetails {
	
	public String employeeName() {
		String empName="Arun";
		return empName;}
	
	public int employeeId() {
		int empId = 125456;
		return empId;}
	
	public String employeeAddress() {
		String empAdd="chennai";
		return empAdd;}
	
	public double employeeSalary() {
		double empSalary=25610.52;
		return empSalary;}
		
	public long employeeMobileNumber() {
		long empMobile = 9840245637L;
		return empMobile;}
 
public static void main (String[] args) {
	
	EmployeeDetails emp = new EmployeeDetails();
	
	System.out.println(emp.employeeName()+"    "+emp.employeeId());
	System.out.println(emp.employeeAddress());
	System.out.println(emp.employeeSalary());
	System.out.println(emp.employeeMobileNumber());
}
}

	
