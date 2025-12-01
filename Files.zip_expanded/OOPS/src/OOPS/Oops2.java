package OOPS;

public class Oops2 {
	int a;
	int b;
	String c;
	String d;
	
	
	Oops2(int aa, int bb)
	{
		a=aa;
		b=bb;
	}
	
	Oops2(String cc, String dd)
	{
		c=cc;
		d=dd;
	}	
	public static void main(String[] args) 
	{
Oops2 m=new Oops2(30,40);
System.out.println("1st name is " +m.a);
System.out.println("2nd name is" +m.b);

Oops2 m1=new Oops2("Hari", "Vishnu ");
System.out.println("1st name is " +m1.c);
System.out.println("1st name is " +m1.d);
			
	}

}
