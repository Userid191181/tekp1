package OOPS;

public class Constructor {
	
	static void test(int num)
	{
		if(num>0)
		{
			test(num-1);
			System.out.println(num);
		}
	}
	public static void main(String[] args) 
	{
		test(10);
		
	}

}
