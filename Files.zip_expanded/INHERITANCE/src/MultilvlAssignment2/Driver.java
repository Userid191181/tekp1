package MultilvlAssignment2;
public class Driver {
	public static void main(String[] args) {
	Laptop l=new Laptop();
	l.gad();
	l.lapi();
	System.out.println("Laptop brand is " +l.brands+ " volume is " +l.volumes);	
	Phone p=new Phone();
	p.phones();
	System.out.println("Phone brand is " +p.brands+ " volume is " +p.volumes);	
	Ipad I=new Ipad();
	I.Ipad();
	System.out.println("Ipad brand is " +I.brands+ " volume is " +I.volumes);			
	}
}
