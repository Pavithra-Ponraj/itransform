
public class Manager extends Employee{

	Manager(long empId, String empName, String address, long phone,double salary) {
		super(empId, empName, address, phone);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 15*salary/100;
		System.out.println("Transport Allowance for Manager = " + transportAllowance);
		
	}
}
