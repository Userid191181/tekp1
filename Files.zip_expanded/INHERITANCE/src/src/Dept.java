package src;

public class Dept extends College
{
	String dname;
	Dept(String dname)
	{
		super("MSP");
		this.dname=dname;
	}
	void ddemo()
	{
		System.out.println("This si dept" +dname);
	}}
