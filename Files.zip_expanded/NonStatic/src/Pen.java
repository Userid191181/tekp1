
public class Pen {	
{
	System.out.println("First non static initializers "); //see first these lines in the curly braces will get executed
}

Pen() //this is constructor which will be executed after the non static initializers are executed which is line 4,5,6
{	
	System.out.println("I have purchased the pen"); //and then this line inside constructor is executed.
}
{
	System.out.println("Second non static initializers "); //Next this line which is 2nd NSI will get executed

}
public static void main(String[] args) {	
	Pen p=new Pen();	
	System.out.println("End of the program");  //this will be execuetd last
}
}




