
public class Giraffe extends Animal {

	String food1;
	String food2;
	
	public Giraffe(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);
	
	}
	
	public Giraffe() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(28);
	}

	@Override
	public boolean eat() {
		
		food1 = "hay";
		food2 = "fruit";
		
		if (enc.storage.foodStore.get(food1) > 0) {
			enc.storage.takeFood(food1);
			int newIceHealth = this.getHealth() + 1;
			this.setHealth(newIceHealth);
			enc.setWaste(4);
			System.out.println(food1 + " is eaten");
			System.out.println(this.getHealth() + " is now his health");
			System.out.println("4 wastage produced by eating hay");
			return true;
		} else if (enc.storage.foodStore.get(food2) > 0) {
			enc.storage.takeFood(food2);
			int newFruitHealth = this.getHealth() + 2;
			this.setHealth(newFruitHealth);
			enc.setWaste(3);
			System.out.println(food2 + " is eaten");
			System.out.println("3 wastage produced by eating fruit");
			return true;
		} else {
			System.out.println("No food available!");
			System.out.println("Health and waste unchanged");
			return false;
		}
		
	}
	
	
	@Override
	public boolean aMonthPasses() {
		
		int overallHealth = this.getHealth() - 2;
		System.out.println("Health before this month was " + this.getHealth());
		System.out.println("Health after this month is now " + overallHealth);

		// Eat a piece of food if available and produce waste if food eaten
		eat();

		return true;
	}
	
	public void neckMessage() {
		
		System.out.println("Giraffe is now having a neck message");
		
	}

	@Override
	public void treat() {
		
		neckMessage();
		setHealth(getHealth() + 4);
		System.out.println("Giraffe's health after treatment is " + getHealth());
		
	}

}
