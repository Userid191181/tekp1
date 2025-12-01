package Abstract1;

abstract class Abstract2 {
	abstract void demo123();
}
 class abc123 extends Abstract2
 {
	void demo123() 
	{
System.out.println("Abstartc class ");
		
	}
	
	public static void main(String[] args) {
		abc123 a=new abc123();
		a.demo123();
	}

	
	 
 }