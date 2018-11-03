package animalKingdom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animalObj = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dogObj = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
		//Dog dogObj1 = new Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
		
		dogObj.eat();
		dogObj.walk();
		dogObj.run();
	}

}
