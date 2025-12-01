package src;

public class FactorialRecursion {

public static void main(String[] args) {
	int b=f(5);
	System.out.println(b);
}
	public static int f(int i)
	{
		if(i==0 || i==1)
		{
			return 1;
		}
		else
			return i*f(i-1);
			//20*3=60*2=120*1=120

	}
	
}

