package src;

class A
{		
		
			void D()
			{
			System.out.println("Common driving");
			}		
		public class B extends A
		{
			void Driving()
			{
				System.out.println("This is driving");
			}
		}
		
		public static void main(String[] args) 
		{
			A c=new A();
			c.D();
			
		}
	
	
}