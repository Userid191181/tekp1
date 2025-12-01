package src;



public class CabDriver {
	public static void main(String[] args) {
		Cab c=new Mini();
		System.out.println(c.name);
		
		Mini m=(Mini) c;
	System.out.println(m.name);
	System.out.println(m.price);
	
	Sedan s=(Sedan) c;
	System.out.println(s.name);
	System.out.println(s.price);
		}
}
