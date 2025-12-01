package OOPS;

public class Oops1 {
	int empid;
	String str;
	Oops1(String s, int id) {
		empid=id;
		str=s;
	}
		
	
	public static void main(String[] args) {
		Oops1 o=new Oops1("hari", 20);
		System.out.println("Value of o is " +o.empid);
		System.out.println("NAme of student1 = " +o.str);
		
		Oops1 o1=new Oops1("mahesh", 40);
		System.out.println("value of o1 is " +o1.empid);
		System.out.println("NAme of student2 = " +o.str);

	}

}
