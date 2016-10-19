
public class Penguin extends Animal {

	String foodEin;
	String foodZwei;

	public Penguin(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);

	}
	
	public Penguin() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(15);
	}

	@Override
	public boolean eat() {

		foodEin = "fish";
		foodZwei = "ice cream";

		if (enc.storage.foodStore.get(foodEin) > 0) {
			enc.storage.takeFood(foodEin);
			int newIceHealth = this.getHealth() + 3;
			this.setHealth(newIceHealth);
			enc.setWaste(2);
			System.out.println(foodEin + " is eaten");
			System.out.println(this.getHealth() + " is now his health");
			System.out.println("2 wastage produced by eating fish");
			return true;
		} else if (enc.storage.foodStore.get(foodZwei) > 0) {
			enc.storage.takeFood(foodZwei);
			int newFruitHealth = this.getHealth() + 1;
			this.setHealth(newFruitHealth);
			enc.setWaste(3);
			System.out.println(foodZwei + " is eaten");
			System.out.println("3 wastage produced by eating ice cream");
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
	
	public void watchAFilm() {
		
		System.out.println("Penguin is watching a film");
		
	}

	@Override
	public void treat() {
		
		watchAFilm();
		setHealth(getHealth() + 3);
		System.out.println("Penguin's health after treatment is " + getHealth());
	 	
	}

}
