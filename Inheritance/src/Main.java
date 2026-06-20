
public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Generic Animal", "Huge", 400);
		doAnimalStuff(animal,"fast");
		
		Dog dog = new Dog();
		doAnimalStuff(dog,"slow");
		
		Dog yorkie = new Dog("Yorkie", 15);
		doAnimalStuff(yorkie, "fast");
		
		Dog wolf = new Dog("Wolf",100);
		doAnimalStuff(wolf,"slow");
		
		Fish goldie = new Fish("Goldie", 0.25,2,3);
		doAnimalStuff(goldie,"fast");
		
	}
	
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("------------------");
	}

}
