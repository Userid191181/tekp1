package src;

public class University {
String uname;
University(String uname)
{
	this.uname=uname;
}

}

class Col1 extends University{
	String cName;
	Col1(String cName)
	{
		super("BTU");
		this.cName=cName;
	
	}
	
}
class Department1 extends Col1{
	String dname;
	Department1(String dname)
	{
		super("MSP");
		this.dname=dname;
	}
}