package exception;

public class Practise1 {

	public static void main(String[] args) {
		
		try
		{
			int a=10/0;
		}
		
		catch(Exception e)
		{
			System.out.println("invalid deno");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
