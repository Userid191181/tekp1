package src;

public class Encapsulation {
private double amt;
private String Bankname;

public void setamt(double amt)
{
	this.amt=amt;
}

public void setBankname(String Bankname)
{
	this.Bankname=Bankname;
}

public double getamt()
{
	return amt;
}
public String getBankname()
{
	return Bankname;
}

public static void main(String[] args) {
	Encapsulation e=new Encapsulation();
	e.setamt(100.50);
	e.setBankname("ICICI");
	System.out.println(e.getBankname());
	System.out.println(e.getamt());
}

}
