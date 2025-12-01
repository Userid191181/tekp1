package Abstract1;

abstract class Phonepay1
{
	abstract void pay();
}

public class Phonepay extends Phonepay1
{
	void pay() {
	System.out.println("This is payment");
	}
	void pay1()
	{
		System.out.println("This is double payment");
	}
	
}

abstract class swiggy extends Phonepay
{
	abstract void orderfood();

}