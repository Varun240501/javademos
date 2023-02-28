package javademosproject;

public class typecastingdemo {
	
	public static void main(String[] args) {
		
		byte b= 100;
		
		int a = 65;
		//a=b;
		//System.out.println(a);
		
		b = (byte) a;
		System.out.println(b);
		
		long l = a;
		
		char ch = 'a';
		System.out.println(ch);
		
		int x = ch;
		System.out.println(x);
		
		int y = 119;
		char z =(char) y;
		System.out.println(z);
		
	}

}