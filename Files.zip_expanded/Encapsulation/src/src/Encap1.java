package src;

public class Encap1 {
	private String name;
	private int aty;
	
	public void setname(String name)
	{
		this.name=name;	}
	
	public void setaty(int name)
	{
		this.aty=aty;
	}	
	public String getname()
	{
		return name;
	}	
	public int getaty()
	{
		return aty;
	}	
	public static void main(String[] args) {
		Encap1 e=new Encap1();
		e.setname("Hari");
		e.setaty(30);
		System.out.println("name is" +e.name);
		System.out.println("qty is" +e.aty);
	}

}
