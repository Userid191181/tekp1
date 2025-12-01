package Module1;

public class Assignment {
	
	public static void demo()

	{
		System.out.println("This is demo");
	}

	public static String demo1()
	{
		return "this is smith";
	}
	public static void demo2(int a, int b)
	{
		int s=a+b;
		System.out.println(s);
	}
	
	
	public static int addition()
	{
		int a=10,b=20;
		int c=a+b;
		//System.out.println(c);
		return c;
	}
	
	public static void add1()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("this is static class");
		
	}	
	
	public static int add2(int i, int j)
	{
		
		int c=i+j;
		System.out.println(c);
		return c;
	}	

	public static int add3(int i, int j)
	{
		
		int c=i+j;
		System.out.println("We are Java developers");
		System.out.println(c);
		return c;
	}	
	
	public static Boolean bbbbb()
	{
		
		
		return true;
	}	
	
	
	public static void main(String[] args)
	{
		//demo();//method without return statement
		//String a=demo1(); //method with return statement
		//System.out.println(demo1());
		//demo2(2,4);
		
		int g=addition(); //Methods without args and with return statements
		System.out.println(g);
		
		add1(); //Methods without args and NO return statements
		Assignment.add1();
		int c=add2(3,4); //Methods with args and  return statements
		System.out.println(c);
		
		int d=add3(3,4); //Methods with args and  no return statements
		System.out.println(Assignment.add3(60000,7));
		
		Boolean cc=bbbbb();
		System.out.println(cc);
		
	}	

}
