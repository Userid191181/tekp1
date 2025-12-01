
public class Nonstatic {
	int a;  //nonstatic varaible
	int b; //nonstatic varaible
	Nonstatic(int a, int b) // this is constructor with args 
	{
		this.a=a; //instance variables
		this.b=b; //instance variables
	}	
	int area() //Non static method with return type as int. 
	{
		return a*b; // as the object already contains values of a and b, it multiplies and returns the result
	}	
public static void main(String[] args) {
	Nonstatic n=new Nonstatic(2,4); // object creation ith reference variable as 'n'
	int d=n.area(); //storing the result of area() to d variable. here need to assign area() with ref variable (n.area) as the method is nonstatic
	System.out.println(n.area()); // calling the Nonstatic method (area()) with the ref variable as 'n' and print the result
	System.out.println(d);//printing the result d
}
}