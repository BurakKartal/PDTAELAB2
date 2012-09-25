package Mammals;
public class PetsTalk {

	public static void main(String[] args) {
		Cat c1 = new Cat("Oscar", "Red", "Van", 15);
		Dog d1 = new Dog("Mahmut", "Black", "Kurt", "Hav Hav");
		System.out.println("My cat's name is " + c1.getName());
		System.out.println("My dog's name is " + d1.getName());
		c1.catSound();
		d1.dogSound();
		d1.animalSound();
		c1.animalSound();
	}

}