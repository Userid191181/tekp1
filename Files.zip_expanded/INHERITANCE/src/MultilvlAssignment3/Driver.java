package MultilvlAssignment3;
//this is hierarchical inheritance
public class Driver {
	public static void main(String[] args) {
		Contains c=new Contains();
		c.Demo();
		c.qty=300;
		c.panel="palstic";
		c.cups="wood";	
		System.out.println(c.cups);
		System.out.println(c.panel);
		System.out.println(c.cups);
		
		Storage s=new Storage ();
		s.Demo1();	
		s.qty=400;
		s.panel="dummt";
		s.cups="glass";
		System.out.println(s.cups);
		System.out.println(s.panel);
		System.out.println(s.cups);
	}
}
