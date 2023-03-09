package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializationdemo {
	
	public static void main(String[] args) {
		SerializationDemoSimplified();
		DeserializationDemo();
	}
	private static void DeserializationDemo() {
		try(FileInputStream fis= new FileInputStream("C:\\Users\\var\\Desktop\\emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);) {
			
			Employee emp=(Employee) ois.readObject();
			System.out.println("Object Deserialized - "+emp);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	
	}
	private static void SerializationDemoSimplified() {
		try(FileOutputStream fos= new FileOutputStream("C:\\Users\\var\\Desktop\\emp.txt");
			ObjectOutputStream ois=new ObjectOutputStream(fos);) {
			Employee emp=new Employee(1,"Mark",8000,"AB1001");
			ois.writeObject(emp);
			System.out.println("Object Serialized");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
	}
}
}
class Employee implements Serializable{
	int id;
	String aadhar;
	String name;
	int salary;
	Employee(int id,String name,int salary,String aadhar){
		this.id= id;
		this.name=name;
		this.salary=salary;
		this.aadhar=aadhar;
	}
	@Override
	public String toString() {
		return this.name+"|"+this.aadhar+"|"+this.id+"|"+this.salary;
	}
}
