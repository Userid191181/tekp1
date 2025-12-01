package src;

public class Department extends College { //Class C extends B
	String depname;
	 
	void assignments()
	{
		System.out.println("Give the assignments");
	}
	Department (String depname)
	{
		super("BIT");
		this.depname=depname;
	}

}
