package scannerdemo;

import java.util.Scanner;

public class scannerclassdemo {
	
	public static void main(String[] args) {
		ScannerDemo1();
		ScannerDemo2();
	}
	private static void ScannerDemo2() {
		int sum=0;
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number (char to exit)");
		while(scanner.hasNextInt()) {
			num= scanner.nextInt();
			sum+=num;
			System.out.println("Enter a number (char to exit)");
		}
		System.out.println("Sum: "+sum);
	}
	private static void ScannerDemo1() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student id:");
		int id=scanner.nextInt();
		
		System.out.println("Enter Student name:");
		String name=scanner.next();
		
		System.out.println("Enter Student score:");
		double score=scanner.nextDouble();
		
		System.out.println("Student details:");
		System.out.println("ID:"+id);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
}

