package Abstract1;

public class User extends Amazon
{	
	void buyproduct() //We are overriding method "buyproduct()" and creating
	//implementation or body in this concrete class.0
	{
		System.out.println("buying product");
	}
	
	void payamount()
	{
		System.out.println("paying amount");
	}
	void payamounts()
	{
		System.out.println("This is extra");
	}
	public static void main(String[] args) {
		User u=new User();
		u.buyproduct(); //buying product
		u.payamount(); //paying amount
		u.demo(); //demo method	
		u.payamounts();
		
	}	
}










