package collectionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SetDemo {
	public static void main(String[] args){
		hashsetdemo();
		randomdemo();
	}
	private static void randomdemo() {
		Random obj=new Random();
		int x=obj.nextInt(10,20);
		System.out.println(x);
	}
	private static void hashsetdemo() {
		Random random=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(random.nextInt(1,10));
		}
		System.out.println(list);
	}
}
