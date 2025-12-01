package OOPS;

public class Constructors1Driver {
	
	//below program is for no args constructor., here we are not passing the argu in the object "Constructors1 b=new Constructors1();"
	//creating the Object in another class "Constructors1Driver" to the Constructor that is created in class "Constructors1" 
	//SO we need to run the program in this class "Constructors1Driver" only and not class "Constructors1" 
	
public static void main(String[] args) {
	Constructors1 b=new Constructors1(); // NO args Object
		b.price=300;
	System.out.println(b.price);	
}
}
