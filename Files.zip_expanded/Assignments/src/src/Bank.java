package src;

class Bank extends AccountAbstract{
	@Override
	void deposit() {
		System.out.println("This is depositing the amount");
	}
	@Override
	void withdraw() {
		System.out.println("This is wihtdrawing the amount");
	}	
	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println("Implementing deposit and withdraw in Savings Account");
		b.deposit();
		b.withdraw();
		System.out.println("--------------");
		
		Bank b1=new Bank();
		System.out.println("Implementing deposit and withdraw in Current Account");
		b1.deposit();
		b1.withdraw();		
	}
	}
