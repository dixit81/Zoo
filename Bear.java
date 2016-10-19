
public class Bear extends Animal {

	String foodUn;
	String foodDeux;

	public Bear(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);

	}

	public Bear() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(18);
	}

	@Override
	public boolean eat() {
		foodUn = "fish";
		foodDeux = "steak";

		if (enc.storage.foodStore.get(foodUn) > 0) {
			enc.storage.takeFood(foodUn);
			int newIceHealth = this.getHealth() + 3;
			this.setHealth(newIceHealth);
			enc.setWaste(2);
			System.out.println(foodUn + " is eaten");
			System.out.println(this.getHealth() + " is now his health");
			System.out.println("2 wastage produced by eating fish");
			return true;
		} else if (enc.storage.foodStore.get(foodDeux) > 0) {
			enc.storage.takeFood(foodDeux);
			int newFruitHealth = this.getHealth() + 3;
			this.setHealth(newFruitHealth);
			enc.setWaste(4);
			System.out.println(foodDeux + " is eaten");
			System.out.println("4 wastage produced by eating steak");
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

	public void hug() {

		System.out.println("Bear is now hugging!");

	}

	@Override
	public void treat() {

		hug();
		setHealth(getHealth() + 3);
		System.out.println("Bear's health after treatment is " + getHealth());
	}

}
