package inheritance;

public class vehicledemo {
	
	public static void main(String[] args)
	{
		Car car= new Car();
		System.out.println(car.fuel());
		Bus bus=new Bus();
		System.out.println(bus.fuel());
		Bike bike = new Bike();
		System.out.println(bike.fuel());
	}

}
class vehicle{
	String fuel() {
		return "petrol";
	}
}
class Bus extends vehicle{
	String fuel() {
		return super.fuel();
	}
}
class Car extends vehicle{
	String fuel() {
		return "Diesel";
	}
}
class Bike extends vehicle{
	
	}
