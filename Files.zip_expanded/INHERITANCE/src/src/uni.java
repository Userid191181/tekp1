package src;

class uni
{
	String  uname;
	uni(String uname)
	{
		this.uname=uname;
		System.out.println(uname);
	}
}
class col extends uni
{
	String cname;
	col(String cname)
	{
		super("BIT");
		this.cname=cname;
		System.out.println(cname);
	}
}
class dep extends col
{
	String dname;
	dep(String dname)
	{
		super("MSP");
		this.dname=dname;
		System.out.println(dname);
	}
}