package Arrays;

public class ReturntypeArray1 {
	public static void main(String[] args) {
		int[] b=demo(); //initiating method and getting the Array integer from the method(int[]a).
		System.out.println(b[1]); //printing the value or an array
		System.out.println(demo()[2]); //initiating method and getting Array integer from the method(int[]a) in one line, duplicate of line 5.
		}
	
	public static int[] demo() {
		int[] a= {1,1,3,4,5};
		return a;
	}

}
