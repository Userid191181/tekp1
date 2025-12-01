package src;

public class Employee 
{
	String fname;
	String lname;
	Employee(String fname, String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	
						public static void main(String[] args) 
						{
							Dept aaa=new Dept("fff", "www");
							System.out.println("full name of employee is: " +aaa.fname+ "" +aaa.lname);			
							System.out.println("name of dept is " +aaa.fname+ "" +aaa.lname);				
						}
					}
