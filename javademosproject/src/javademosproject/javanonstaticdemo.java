package javademosproject;

public class javanonstaticdemo {
	
	public javanonstaticdemo() {
		System.out.println("From constructor");
	}
	{
		System.out.println("From non-static block1");
	}
	public static void main(String[] args) {
		System.out.println("From main method");
		javanonstaticdemo jnsd = new javanonstaticdemo();
	}

}
