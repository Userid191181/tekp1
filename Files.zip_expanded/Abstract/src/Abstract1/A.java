package Abstract1;

interface B1 {
	void demo();

}
class A implements B1
{
	public void demo()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		A a=new A();
		a.demo();
	}
}
