package src;

public class multlvlinhe1 {
	String name;
	multlvlinhe1(String name)
	{
		this.name=name;	
	}	
	public static void main(String[] args) {
		Dept d=new Dept("OFC");
		System.out.println(d.name);
		System.out.println(d.dname);
		//System.out.println(d.cname);
	}
}
 class College extends multlvlinhe1
{

String cname;
College(String cname)
	{
	super("BIT");
	this.cname=cname;
	}
	
}
 class Dept extends multlvlinhe1
{
	String dname;
	Dept(String dname)
	{
		super("MSP");
		this.dname=dname;
	}
	
}
