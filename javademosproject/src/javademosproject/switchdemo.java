package javademosproject;

public class switchdemo {
	
	public static void main(String[] args) {
		
		int userOption=4;
		switch(userOption) {
		case 1:
			System.out.println("Main menu");
			break;
		case 2:
			System.out.println("Existing customers");
			break;
		case 3:
			System.out.println("New customers");
			break;
		default:
			System.out.println("Pls select a valid option");
		
		}
	}

}
