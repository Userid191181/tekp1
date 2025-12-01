package src;

abstract class AnimalAbstract {
abstract void makesound();

}

class Dog extends AnimalAbstract{
	@Override
	void makesound() {
		System.out.println("Dogs barks woh woh");	
	}	
}
class Cat extends AnimalAbstract{

	@Override
	void makesound() {
		System.out.println("Cat says meow meow");	
	}	
}