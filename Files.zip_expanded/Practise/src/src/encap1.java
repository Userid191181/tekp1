package src;

public class encap1 {
private static int id;
private static String name;

public void setname(String name)
{
	this.name=name;
}

public void setid(int id)
{
	this.id=id;
}

public static String getname()
{
	return name;
}

public static int getid()
{
return id;	
}
public static void main(String[] args) {
encap1 e=new encap1();
e.id=100;
e.name="Hari";
System.out.println(getid());
System.out.println(getname());
}
}
