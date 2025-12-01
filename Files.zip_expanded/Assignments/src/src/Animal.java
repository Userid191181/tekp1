package src;


class DogEating extends Animal
{
	public void Ani()
	{
		System.out.println("Dog is eating");
	}
}
class CatEating extends DogEating
{
	public void Ani()
	{
		System.out.println("Cat is eating");
	}
}
	class Animal 
	{
		public void Ani()
		{
			System.out.println("This is Animal");
		}
	
	public static void main(String[] args) 
	{
//		Animal f=new DogEating();
//		f.Ani();	
		Animal b=new CatEating();
		b.Ani();
}
}

