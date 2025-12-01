package Methodloverriding;


 class Uber extends Cab
{
	@override
	void bookcab()
	{
		System.out.println("Booking from Ubder");
	}	
}
	 class Ola extends Cab
	{
		@override
		void bookcab()
		{
			System.out.println("Booking fomr Ola");
		}
	}

public class Cab 
{
void bookcab()
{
	System.out.println("Booking a Cab");
}
public static void main(String[] args) 
{
	Cab c=new Uber();
	c.bookcab();
	Cab c1=new Ola();
	c1.bookcab();
}
}