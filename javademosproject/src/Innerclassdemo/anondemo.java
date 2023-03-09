package Innerclassdemo;

public class anondemo {
	public static void main(String[] args) {
		PrinterConnection con=PrinterDriver.getconnection();
		con.print();
	}

}
class PrinterDriver{
	static PrinterConnection getconnection() {
		PrinterConnection con=new PrinterConnection() {
		@Override
		public void print() {
			System.out.println("Printing...");
		}
	};
	return con;
	}
}
interface PrinterConnection{
	void print();
}