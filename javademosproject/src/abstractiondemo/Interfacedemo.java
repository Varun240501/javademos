package abstractiondemo;

public class Interfacedemo {
	
	public static void main(String[] args) {
		Honda honda=new Honda();
		honda.go();
		honda.stop();
	}

}
interface Car{
	void go();
	void stop();
}
class Honda implements Car{

	@Override
	public void go() {
		System.out.println("Inside Honda.go()....");
		
	}

	@Override
	public void stop() {
		System.out.println("Inside Honda.stop()....");
		
	}
	
}
