package OOPS;

public class ConstructorOverloading {
		int sid;
		String sname;
		int age;	
	
	ConstructorOverloading()
	{
		System.out.println("Starting of the program");
	}
	
	ConstructorOverloading(int sid)
	{
		this.sid=sid;
	}
	
	ConstructorOverloading(String sname)
	{
		this.sname=sname;
	}

	ConstructorOverloading(int sid, String sname, int age)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
	}
	
					public static void main(String[] args) {
						ConstructorOverloading s1=new ConstructorOverloading();
						System.out.println(s1.sid); //prints default value as 0
						System.out.println(s1.age); //prints default value as 0
						System.out.println(s1.sname); //prints default value as null
						System.out.println("-----------");
						ConstructorOverloading s2=new ConstructorOverloading(2);
						System.out.println(s2.sid); //prints value as 2
						System.out.println("-----------");
						ConstructorOverloading s3=new ConstructorOverloading("Hari");
						System.out.println(s3.sname);//prints string value as Hari
						System.out.println("-----------");
						ConstructorOverloading s4=new ConstructorOverloading(201, "Shiva", 25);
						System.out.println(s4.sid); //prints value as 201
						System.out.println(s4.sname); //prints string value as Hari
						System.out.println(s4.age); //prints value as 25
						System.out.println("-----------");
					}
					
	
	}

