package exception;

public class Practise {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		try
		{
			for(int i=0; i<=a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("invalid array");
			System.out.println(e.getMessage());
			e.printStackTrace();			
		}
		finally
		{
			System.out.println("This is handling exception");
		}}}
