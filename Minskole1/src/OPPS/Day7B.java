package OPPS;

public class Day7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog Moti = new Dog();
		Moti.makeSound();
		Moti.type();

		Cat Poorva = new Cat();
		Poorva.makeSound();
		Poorva.type();
	}

}

abstract class Animals {
	public abstract void makeSound();

	public void type() {
		System.out.println("I AM Animal Type");
	}

}

class Dog extends Animals {
	@Override
	public void makeSound() {
		System.out.println("BOW BOW");
	}
}

class Cat extends Animals {
	@Override
	public void makeSound() {
		System.out.println("MEOW MEOW");
	}
}