
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Manager Emp1 = new Manager(126534,"Peter","Chennai",237844,65000);
		Emp1.calculateSalary();
		Emp1.calculateTransportAllowance();
		
		
		Trainee Emp2 = new Trainee(29846,"Jack","Mumbai",442085,45000);
		Emp2.calculateSalary();
		Emp2.calculateTransportAllowance();
	}

}
