package Garbagecollection;
import java.util.ArrayList;
import threadingdemo.utils;

public class garbagecollectiondemo {
	public static void main(String[] args) {
		for(int i=1;i<100000;i++) {
			new House(i);
		}
	}
}
class House{
	int id;
	House(int id){
		this.id=id;
		Utils.printmessage("House created- "+id);
	}
	protected void finalize() throws throwable{
		Utils.printmessage("House destroyed- "+id);
	}
}