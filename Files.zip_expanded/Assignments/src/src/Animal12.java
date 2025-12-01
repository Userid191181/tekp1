package src;

public class Animal12
{
	Animal12(){
		System.out.println("This si A");
	}
	Animal12(int a){
		System.out.println("This si add A");
	}}
class mmm extends Animal12
{
	mmm()	{
		super(10); //Super () calls the parent constructor in parent class, here super is calling with parameter so line 8 willbe executed
		System.out.println("This is mmm123");
	}	
	mmm(int a){
		this(); //this() calls the parent constructor, here line 13 will be executed
		System.out.println("This is mmm123 this ");
	}	
}