package MultilvlAssignment1;

public class Driver {
	public static void main(String[] args) {
		Message m=new Message();
		m.msgcount=10;
		m.call=30;
		m.brand="Samsung";
		m.brands();
		System.out.println("Phone brand is " +m.brand );
		m.calls();
		System.out.println("Calls we can make is more than " +m.call+ " per day" );
		m.msgcount();
		System.out.println("Messages we can send is " +m.msgcount);
	}
}
