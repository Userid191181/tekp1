package src;

public class pppp {
	static int a=20;
	public static void test()
	{
		pppp d=new pppp();
		System.out.println(d.a);
	}
	
	public int hashCode()
	{
		return a;
	}
	public static void main(String[] args) {
		pppp a=new pppp();
		pppp a1=new pppp();
		System.out.println(a.hashCode()==a1.hashCode());
		System.out.println(a.equals(a1));
		
	}

}
