package Innerclassdemo;

public class innerclassdemo2 {
	public static void main(String[] args) {
		
	}
	

}
class Car{
	private static String model="Hyundai I20 Automatic";
	private String colour;
	void start() {
		System.out.println("Car with "+colour+"is starting");
	}
	Car(String colour){
		this.colour=colour;
	}
class MusicSystem{
	private int numofchannels;
	MusicSystem(int num){
		this.numofchannels=num;
	}
	void displayDetails() {
		System.out.println("Model of the car: "+Car.model);
		System.out.println("Colour of the car: "+Car.this.colour);
		System.out.println("No of channels in music system: "+this.numofchannels);
	}
}
}
