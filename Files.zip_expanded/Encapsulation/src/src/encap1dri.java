package src;

public class encap1dri {
	int a=10;
	String s="Hari";
	public void sets(String s)
	{
		this.s=s;
	}
	public void seta(int a)
	{
		this.a=a;
	}
	
	public int geta()
	{
		return a;
	}
	public String gets()
	{
		return s;
	}
	
	public static void main(String[] args) {
		encap1dri e=new encap1dri();
		e.seta(20);
		e.sets("Hari");
		System.out.println(e.geta());
		System.out.println(e.gets());
	}
	
}
