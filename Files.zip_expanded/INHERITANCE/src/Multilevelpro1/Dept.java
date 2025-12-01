package Multilevelpro1;

public class Dept {
	public static void main(String[] args) {
//0.1.1.2.3.5.8
		
		int a=0;
		int b=1;
		int count=0;
		for(int i=0; i<=4; i++)
		{
				count=a+b;
				System.out.println(a);
				a=b;
				b=count;
		}
		//System.out.println(count);
		
		
		
	}
	
}
