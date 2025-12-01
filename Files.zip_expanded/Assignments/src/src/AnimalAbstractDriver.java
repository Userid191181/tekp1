package src;

public class AnimalAbstractDriver {
public static void main(String[] args) {
	AnimalAbstract b=new Dog();
	b.makesound();
	AnimalAbstract a=new Cat();
	a.makesound();
}
}
