package src;



public class Task implements ATM
{
	@Override
	public void Demo() {
		System.out.println("Welcome to ATM");		
	}
	public static void main(String[] args) {
		ATM c=new Task();
		c.Demo();
		}	
}