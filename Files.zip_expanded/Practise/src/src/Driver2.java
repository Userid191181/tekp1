package src;

interface Driver2 {

	abstract void memo();
	void memo1();
}

class mmm implements Driver2
{

	@Override
	public void memo() {
		System.out.println("Line one");
		
	}

	@Override
	public void memo1() {
		System.out.println("Line two");
		
	}
	
}
