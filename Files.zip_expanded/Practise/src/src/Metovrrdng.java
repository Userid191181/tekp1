package src;

class  Metovrrdng
{

	void Demo()
	{
		System.out.println("This si mobile");
	}
	public static void main(String[] args) {
		Charged c=new Charged();
		c.Demo();
	}
	
}

class Charged extends Metovrrdng
{
	void Demo()
	{
		System.out.println("thi is charger second one");
	}
}



