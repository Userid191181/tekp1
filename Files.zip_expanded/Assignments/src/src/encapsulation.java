package src;

public class encapsulation {
int a;
int b;
String n;

encapsulation ()
{
System.out.println("blank");
}
encapsulation (int a, int b)
{
	this();
	this.a=a;
	this.b=b;
System.out.println("a and b");
}
encapsulation (int a, int b, String n)
{
	this(3,5);
	this.n=n;
	System.out.println("Name is " +n);
}

	
public static void main(String[] args) {	
	encapsulation e=new encapsulation(2,4, "Hari");
	
	

}
}
