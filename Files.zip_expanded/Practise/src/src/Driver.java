package src;

public class Driver {
	public static void main(String[] args) {
		A nnn=new A();
		nnn.IDemo();
		nnn.IDemo1();
		//nnn.IDemo2();
		
		Z nnn1=new Z();
		nnn1.IDemo();
		nnn1.IDemo1();
		//nnn.IDemo2();
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3.equals(s4));
	}
}
