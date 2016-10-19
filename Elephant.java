
public class Elephant extends Animal {

	String a;
	String b;

	public Elephant(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);

	}
	
	public Elephant() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(36);
	}

	@Override
	public boolean eat() {

		a = "hay";
		b = "fruit";

		if (enc.storage.foodStore.get(a) > 0) {
			enc.storage.takeFood(a);
			int newIceHealth = this.getHealth() + 1;
			this.setHealth(newIceHealth);
			enc.setWaste(4);
			System.out.println(a + " is eaten");
			System.out.println(this.getHealth() + " is now his health");
			System.out.println("4 wastage produced by eating hay");
			return true;
		} else if (enc.storage.foodStore.get(b) > 0) {
			enc.storage.takeFood(b);
			int newFruitHealth = this.getHealth() + 2;
			this.setHealth(newFruitHealth);
			enc.setWaste(3);
			System.out.println(b + " is eaten");
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

	public void bath() {

		System.out.println("Elephant is now having a bath!");

	}

	@Override
	public void treat() {

		bath();
		setHealth(getHealth() + 5);
		System.out.println("Elephant's health after treatment is " + getHealth());
	}

}
