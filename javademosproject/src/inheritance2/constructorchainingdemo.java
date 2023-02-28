package inheritance2;

public class constructorchainingdemo {
	
	public static void main(String[] args) {
		Childclass cc=new Childclass(10);
		
	}

}
class Superclass{
	int x;
	Superclass(){
		System.out.println("No args superclass constructor");
	}
	Superclass(int x){
		this.x=x;
		System.out.println("One args superclass constructor");
	}
}
class Childclass extends Superclass{
		Childclass(){
			this(10);
			System.out.println("No args chidclass constructor called");
		}
		Childclass(int y){
			super(y);
			System.out.println("One args child constructor called");
		}
}
