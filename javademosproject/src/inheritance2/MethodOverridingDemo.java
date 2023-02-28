package inheritance2;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Car car=new Car();
		car.fuel();
		Bike bike=new Bike();
		bike.fuel();
		Bus bus=new Bus();
		bus.fuel();
	}
}
class vehicle{
	int a,b;
	vehicle(int a,int b){
		this.a=a;
		this.b=b;
	}
	void fuel() {
		System.out.println("petrol");
	}
}
class Bus extends vehicle{
	int c, d;
	Bus(int a, int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void fuel() {
		System.out.println("CNG");
	}
}
class Car extends vehicle{
		void fuel() {
		super.fuel();
		System.out.println("Diesel");
	}
}
//class Bike extends vehicle{
//	
//}