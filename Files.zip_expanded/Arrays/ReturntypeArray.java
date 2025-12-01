package Arrays;

public class ReturntypeArray {
	public static void main(String[] args) {
		int[] b=demo();  //initiating method and getting the Array integer from the method(int[]a).
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}		
	}
	
	public static int[] demo() // method with return type as Array Integer (int[])
	{
		int [] a= {1,2,3,4,5}; //creating an array in the called method
		return a;				// returning the integer array type.
	}

}
