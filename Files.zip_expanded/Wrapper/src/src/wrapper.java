package src;

public class wrapper {	
		int f;
		wrapper(int f)
		{
			this.f=f;
		}
		
		public static void main(String[] args) {
			int a=10;
			System.out.println(a);
			Integer b=a;
			System.out.println(b);
			
			Integer d=new Integer(100);
			System.out.println(d); //toStrng is already overridden in wrapper class
			
			wrapper e=new wrapper(300);
			System.out.println(e);
		}
	}



