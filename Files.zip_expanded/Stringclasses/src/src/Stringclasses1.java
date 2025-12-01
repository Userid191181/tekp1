package src;

public class Stringclasses1 {
public static void main(String[] args) {
String s1=new String("java"); //storing java to s1
String s2=s1.concat("programming"); //joining both java and programming
System.out.println(s1);
System.out.println(s2);
System.out.println("______");

StringBuffer s=new StringBuffer("mava"); //creating String buffer and storing the value java.

s.append("progaammingsss");
System.out.println(s);

s.replace(0, 4, "demo");
s.reverse();
System.out.println(s);
String dd=s.toString();

System.out.println(dd);
for(int i=0; i<=dd.length()-1; i++)
{
	char [] ch=dd.toCharArray();
	System.out.print(ch[i]);
}




	}
}
