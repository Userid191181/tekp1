package src;

public class Mobile {
	int price;
	Mobile(int price)
	{
		this.price=price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mobile) {
			Mobile m1=(Mobile)obj; // current object==passed object m==m1
			return this.price==m1.price;
		}
		else {
			return false;
		}
	
	}
	
	public static void main(String[] args) {
		Mobile m=new Mobile(10000);
		Mobile m1=new Mobile(10000);
		System.out.println(m.equals(m1));
		System.out.println(m.price==m1.price);

		
	}

}
