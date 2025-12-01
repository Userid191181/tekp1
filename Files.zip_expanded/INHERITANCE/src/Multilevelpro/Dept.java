package Multilevelpro;

public class Dept extends University {
	String dname;
	
	Dept()
	{
		super("BTU");
		this.dname=dname;
	}
	void Demo1()
	{
		System.out.println("this is seocnd");
	}
	
	public static void main(String[] args) {
		Dept d=new Dept();
		System.out.println(d.uname);
		d.demo();
		d.Demo1();
		
		
		Colleage c=new Colleage("MSP");
		System.out.println(c.cname);
		
	}
	
}
