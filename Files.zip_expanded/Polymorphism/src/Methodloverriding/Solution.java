package Methodloverriding;

public class Solution {
	//1.using method we can upcaste
//	static void selectApp(Cab c)
//	{
//		c.bookcab();
//	}
	public static void main(String[] args) {
//		selectApp(new Uber());
//		selectApp(new Ola());
//	
//	//2.using single reference
//	Cab c;
//	c=new Uber();
//	c.bookcab();
//	c.new Ola();
//	c.bookcab();
	
	//3.seperate upcasting
	Cab c1=new Uber();
	c1.bookcab();
	Cab c2=new Ola();
	c2.bookcab();
	}
}
