package abstractiondemo;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		BMWThreeSeries bmw3=new BMWThreeSeries();
		bmw3.start();
		bmw3.accelerate();
		
		BMWFiveSeries bmw5=new BMWFiveSeries();
		bmw5.start();
		bmw5.accelerate();
		
		BMW bmw=new BMWThreeSeries();
		bmw.start();
		bmw.accelerate();
	}

}
abstract class BMW{
	void start() {
		System.out.println("BMW Started");
	}
	abstract void accelerate();
}
class BMWThreeSeries extends BMW{

	@Override
	void accelerate() {
		System.out.println("Three times acceleration....");
	}
	
}
class BMWFiveSeries extends BMW{

	@Override
	void accelerate() {
		System.out.println("Five times Acceleration...");
	}
	
}