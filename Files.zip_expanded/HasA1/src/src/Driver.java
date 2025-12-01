package src;

public class Driver {

	public static void main(String[] args) {
		Phone p=new Phone("Nokia");
		System.out.println(p.getmodelName());
		System.out.println(p.getSim().getsimnumber());
	}
}
