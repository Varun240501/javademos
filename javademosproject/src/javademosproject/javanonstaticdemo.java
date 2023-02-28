package javademosproject;

public class javanonstaticdemo {
	
	private javanonstaticdemo() {}
	
	static {
		System.out.println("From static block1");
	}
	
	{
		System.out.println("From non-static block1");
	}
	
	public static void main(String[] args) {
		System.out.println("From main method");
		javanonstaticdemo jnsd1 = new javanonstaticdemo();
		javanonstaticdemo jnsd2 = new javanonstaticdemo();
		
		Car myCar = new Car();
		System.out.println(myCar.numofwheels);
		System.out.println(Car.manufacturer);
		
	}
 
}
