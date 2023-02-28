package abstractiondemo;

public class finalkeyworddemo {
	
	public static void main(String[] args) {
		int x=5;
		x=6;
		
		B b =new B();
		b.dosomework();
	}
}
class A{
	final void dosomework() {
		System.out.println("A is doing somework");
	}
}
class B extends A{
	void dosomework() {
		System.out.println("B is doing somework");
	}
}
