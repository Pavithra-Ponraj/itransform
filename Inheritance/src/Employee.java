public class Employee {
	
long empId;
String empName;
String address;
long phone;
double salary;
double allowance=250.80;
double hra=1000.50;

Employee(long empId,String empName,String address,long phone){
	this.empId = empId;
	this.empName = empName;
	this.address = address;
	this.phone = phone;
}
public void calculateSalary() {
	double Salary = salary + ( salary * allowance/100) + ( salary * hra/100); 
	System.out.println("Salary of "+ empName +" = " + Salary);
}
public void calculateTransportAllowance() {
	double transportAllowance = 10*salary/100;
	System.out.println("Transport Allowance for Employee = " + transportAllowance);
}
}
