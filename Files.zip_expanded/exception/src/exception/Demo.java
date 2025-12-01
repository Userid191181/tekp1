package exception;

public class Demo {
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0); //Arithmetic exception
		}
		catch(Exception e)
		{
			System.out.println("invalid denominator u cannot handle it");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is the end of exception");
		}
	}}