package Abstract1;

public class Customer extends swiggy
{

	@Override
	void pay() {
		System.out.println("This is to pay the amount to order food");	
	}
	@Override
	void orderfood() {
		System.out.println("This is for getting the food orders");		
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.pay();
		c.orderfood();
		c.pay1();
	}
}
