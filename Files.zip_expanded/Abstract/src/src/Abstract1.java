package src;

abstract class Gpay {
abstract void payment();
void demo()
{
System.out.println("demo method");
}
}

abstract class Amazon extends Gpay
{
	abstract void buyproduct();
}