package javademosproject;

public class operatorsdemo {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int result=a+b;
		System.out.println(result);
		//arithmetic operators
		result=a-b;
		result=a*b;
		result=a/b;
		result=a%b;
		
		//unary operators
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
		boolean isselected= false;
		if(isselected){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		//logical operators
		int age=14;
		boolean drivingClassesAttended = true;
		if (age>15 && drivingClassesAttended) {
			System.out.println("Licence issued");
		}else {
			System.out.println("Come later");
		}
		int balance=5000;
		boolean isAccountActive = true;
		if (balance>1000 || isAccountActive) {
			System.out.println("Transaction Approved");
		}else {
			System.out.println("Transaction denied");
		}
		
		//ternary operator
		String license=(age>15 && drivingClassesAttended) ? "License Issued":"Come Later";
		System.out.println(license);
	}
}
