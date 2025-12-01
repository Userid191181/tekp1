package src;

 class MethodOverriding 
 {
void Demo(int a, int b)
{
	int c=a+b;
	System.out.println(c);
	
}

static class B extends MethodOverriding
{
	void Demo(int a, int b)
	{
		int c=a+b+1;
		System.out.println(c);
	}
}
	 public static void main(String[] args) {
		 MethodOverriding m= new B();
		 m.Demo(2,2);
	}	 
}