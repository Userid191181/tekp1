
public class Employee {
	
	String Empname="Hari";	
	String Companyname="ABC company";	
	
	{
		System.out.println("This is to display name");
		System.out.println(Companyname);
	}
	
	{
		System.out.println("This is to display Employee name");
		System.out.println(Empname);
	}
	
	public static void main(String[] args) {		
		Employee e=new Employee();
		System.out.println(e.Companyname);
		System.out.println(e.Empname);

	}
}
