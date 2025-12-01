package src;

public class Food {
	void Pizza()
	{
		System.out.println("This is ordering the food");
	}
	void Pizza(String Chilly, int c)
	{
		System.out.println("Pizza is " +Chilly+ " count is " +c);
	}
	void Pizza(String Chilly, String Pepper, int c)
	{
		System.out.println("Pizza is " +Chilly+ " count is " +c);
	}
	
public static void main(String[] args) {
	Food f=new Food();
	f.Pizza();
	f.Pizza("Spicy", 5);
	f.Pizza("Spicy", "flakes", 10);
}
}
