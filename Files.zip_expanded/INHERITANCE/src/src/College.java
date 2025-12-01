package src;

public class College extends University {


	String cname;
	College(String cname) {
		super("VTU");
		this.cname=cname;
	}	
	void cdemo()
	{
		System.out.println("conduct internals" +cname);
	}}
