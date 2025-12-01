package Multilevelpro1;

public class College extends University{
String cname;

College (String cname)
{
	super("VTU");
	this.cname=cname;
	
}

public static void main(String[] args) {
	College c=new College("MSP");
	System.out.println(c.uname+ "and" +c.cname);
}


}
