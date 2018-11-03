package animalKingdom;

public class Dog extends Animal {
	
	private String coat;
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		
		super(name, 1, 1, size, weight);
		this.coat = coat;
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		
	}
	
	@Override
	public void eat() {
		
		System.out.println("Dog.eat() is called");
		chew();
		super.eat();
		
	}
	
	private void chew() {
		
		System.out.println("Dog.chew() is called.");
		
	}
		
	public void walk() {
		
		System.out.println("Dog.walk() is called");
		super.move(5);
		
	}
	
	public void run() {
		
		System.out.println("Dog.run() is called");
		move(10);
		
	}
	
	private void moveLegs(int speed){
		
		System.out.println("Dog.moveLegs()is called");
		
	}
	
	@Override
	public void move(int speed) {
		
		System.out.println("Dog.move() is called");
		moveLegs(speed);
		super.move(speed);
		
	}
}
