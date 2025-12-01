package src;
//This program is from GOOGLE
public class HasAName {  //Storing full name (fname,mname,lname) in the class HasAName
		String fname;
		String mname;
		String lname;
		
	HasAName(String fname, String mname, String lname)
	{
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
	}
	
	
	public static void main(String[] args) {
		//Employee e=new Employee();
		HasAName H=new HasAName("Hari", "Ram", "Das");
		//e.display(30, H);
	}	
	
	public class Employee  // here we are NOT extending the class we are having Employee class Has A relation with HasAName class
	{
		int age;
		HasAName H;  //Reusing the class that is already created (class HasAName) it is saved/stored in 'H" object. We declaring object reference in this class.
					//And reusing Name as and when required.
	
		public void display(int age, HasAName H)
		{
			System.out.println("Age is " +age);
			System.out.println("Fullname is" );
		}
		
	}	
}
