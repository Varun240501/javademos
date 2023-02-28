package loopsdemo;

public class loopdemo {
	
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			System.out.println("Hello world");
		}
		for(int j=1;j<=10;j++)
		{
			if(j%2==0) {
				System.out.println(j);
			}
		}
		for(int k=0;k<=10;k=k+2) {
			System.out.println(k);
		}
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		for(int j=10;j>0;j--) {
			System.out.println(j);
		}
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			if(j>=5)
				break;
			else
				continue;
		}
	}

}
