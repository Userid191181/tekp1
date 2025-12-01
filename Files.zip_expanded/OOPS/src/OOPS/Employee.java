package OOPS;

public class Employee {	
	//create 3 constru's for class Employee with properties as eid-string. ename-string esalary-double.
	//fisrt con is no args, 2nd is accepts 2 args, 3rd accepst 3 args
	String eid;
	String ename;
	double esal;
	Employee()
	{
		System.out.println("program started");
	}
	
	Employee(String ename, double esal)
	{
		this.ename=ename;
		this.esal=esal;
	}
	Employee(String eid, String ename, double esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		
		Employee e2=new Employee("Hari", 200000.00);
		System.out.println(e2.ename);
		System.out.println(e2.esal);
		Employee e3=new Employee("emp12345", "Shiva", 900000.00);
		System.out.println(e3.ename);
		System.out.println(e3.esal);
		System.out.println(e3.eid);
	}

}
