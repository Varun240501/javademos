package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String[] args) {
		demo3();
	}
	private static void demo1() {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20.4);
		list.add("hello");
		System.out.println(list);
	}
	private static void demo2() {
		ArrayList<String> newlist=new ArrayList<String>();
		newlist.add("10");
		newlist.add("20.4");
		newlist.add("world");
		System.out.println(newlist);
	}
	private static void demo3() {
		LinkedList<Integer> intlist=new LinkedList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			intlist.add(i);
		}
		System.out.println(intlist);
		intlist.add(2,100);
		System.out.println(intlist);
		intlist.add(3,101);
		System.out.println(intlist);
		intlist.remove(4);
		System.out.println(intlist);
		
		int value=100;
		if(intlist.contains(value)) {
			System.out.println("In the list");
		}else {
			System.out.println("Not in the list");
		}
	}
}
