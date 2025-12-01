package src;

public class multilvling2 {
String uname;

 multilvling2(String uname)
{
	this.uname=uname;
}	
 public static void main(String[] args) {
	Dept3 d=new Dept3("OFC");
	System.out.println(d.dname);	
	System.out.println(d.cname);	
	System.out.println(d.uname);	
} 
}

class college3 extends multilvling2
{
String cname;	
	college3(String cname)
	{
		super("BTU");
		this.cname=cname;
	}
}

class Dept3 extends college3
{
	String dname;
	Dept3(String dname)
	{
		super("MSP");
		this.dname=dname;
	}
}

