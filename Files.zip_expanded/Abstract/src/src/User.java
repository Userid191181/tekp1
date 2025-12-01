package src;

public class User extends Amazon
{

	@Override
	void buyproduct() {
		System.out.println("aaaaa");
		
	}

	@Override
	void payment() {
		System.out.println("bbbbbb");
				
	}
	public static void main(String[] args) {
		User u=new User();
		u.buyproduct();
		u.payment();
		u.demo();
	}

}
