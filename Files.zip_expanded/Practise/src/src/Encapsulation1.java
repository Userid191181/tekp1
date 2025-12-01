package src;

interface Encapsulation1 {
	
	 void Memo();
	 void Memo1();

}

 abstract class Home implements Encapsulation1
{
	 abstract void Remo();
	
	
}
 
 class BedRoom extends Home
 {

	@Override
	public void Memo() {
		System.out.println("Bedroom Method1");
		
	}

	@Override
	public void Memo1() {
		System.out.println("Bedroom Method2");
		
	}

	@Override
	void Remo() {
		System.out.println("Bedroom Remo123");
		
	}


	

	
	 
 }