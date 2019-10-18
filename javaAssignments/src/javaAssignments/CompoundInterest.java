package javaAssignments;

public class CompoundInterest {

    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        System.out.println("Compond Interest is " + interest);
        System.out.println("Amount is " + amount);
    }
    public static void main(String[] args) {
    	CompoundInterest obj = new CompoundInterest();
    	obj.calculate(5000, 12, 0.3, 12);
    	
    }
}