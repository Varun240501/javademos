package Innerclassdemo;
public class innerclasses {
	public static void main(String[] args) {
		ElectronicDevice.poweron();
		ElectronicDevice.chip.displaybrand();
		ElectronicDevice.chip Chip=new ElectronicDevice.chip();
		Chip.specs();
		
		ElectronicDevice laptop=new ElectronicDevice();
		laptop.poweron();
		
		ElectronicDevice.processor proc=laptop.new processor();
		proc.getvoltage();
		
		ElectronicDevice.processor.displayprocbrand();
	}

}
class ElectronicDevice{
	static void poweron() {
		System.out.println("Device powering on.....");
	}
	static class chip {
		static void displaybrand() {
			System.out.println("From Sony....");
		}
		void specs() {
			System.out.println("Specifications for this chip...");
		}
	}
	class processor{
		void getvoltage() {
			System.out.println("Display voltage on processor....");
		}
		static void displayprocbrand() {
			System.out.println("Processor brand displayed....");
		}
	}
}