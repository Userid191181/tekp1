package Module1;

public class Day2 
{
	public static void main(String[] args) 
	{ 

//swap 2 number without using temp variable by implementing method.
		
	swap(5,10);	
	

		
	}
	
	static int swap(int i, int j)
	{
		i=i+j;
		j=i-j;
		i=i-j;

		return i;
		
		
//		System.out.println("i= " +i);
//		System.out.println("j= " +j);
	}

}
