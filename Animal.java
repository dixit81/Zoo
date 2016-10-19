import java.util.Arrays;

/**
 * @author Devashish Take everything step by step . As we progress you may need
 *         to, and choose to add additional methods to your abstract class.
 */

// Abstract class - can't be instantiated, others will override all common methods
public abstract class Animal {

	private int age; // age of animal
	private char gender; // gender of animal
	private String[] eats; // types of food it eats
	private int health; // health value
	private int lifeExpectancy; // total life expectancy
	Enclosure enc = new Enclosure();

	public Animal() {
		this.age = 1;
		this.gender = 'f';
		this.eats = null;
		this.health = 1;
		this.lifeExpectancy = 1;
	}
	
	/*
	 * Animal class constructor, other classes will use super(age,..);
	 */

	public Animal(int age, char gender, String[] eats, int health, int lifeExpectancy) {

		this.age = age;
		this.gender = gender;
		this.eats = eats;
		this.health = health;
		this.lifeExpectancy = lifeExpectancy;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// checks if can eat type of food - check again
	public boolean canEat(String food) {

		for (int i = 0; i < eats.length; i++) {

			if (eats[i].equals(food)) {
				return true;
			}

		}

		return false;

	}
	
	public boolean eat() {
		
		System.out.println("Eating now");
		
		return true;
		
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	} 

	// reduces animal health - linked with life expectancy
	public void decreaseHealth() {

	}

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}
	
	/*
	 * Some aspects, such as the lifeExpectancy, will be specific for each type
	 * of Animal you go on to create.
	 */

	
	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	
	public void setEnclosure(Enclosure e) {
	
		//e.toString();
		
		enc = e;
		
		System.out.println("Allocated to " + e.toString());
		
	}

	// treats the animal? Does something with health?
	public abstract void treat();
	
	/*
	 * aMonthPasses() will be called on each Animal in the zoo once each month
	 * and will contain all the code that enables the animal to do what they
	 * need to do and to change its state over time. Principally, for Animals it
	 * will allow them to eat, excrete and grow old.
	 * 
	 */

	public abstract boolean aMonthPasses();

	@Override
	public String toString() {
		return "Animal [age=" + age + ", gender=" + gender + ", eats=" + Arrays.toString(eats) + ", health=" + health
				+ ", lifeExpectancy=" + lifeExpectancy + "]";
	}

	
}
