package Abstract1;

abstract class Gpay 
{
	abstract void payamount();
	void demo()
	{
		System.out.println("demo method");
	}
}

abstract class Amazon extends Gpay
{
	abstract void buyproduct(); //as the method is abstract it has no body
}

abstract class Flipkart extends Amazon
{
	abstract void payamounts();
	

}