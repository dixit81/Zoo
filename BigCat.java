
public abstract class BigCat extends Animal {

	String teak = "steak";
	String lerey = "celery";

	public BigCat() {

	}

	public BigCat(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);
	}
	
	public boolean eat() {

		if (enc.storage.foodStore.get(teak) > 0) {
			enc.storage.takeFood(teak);
			System.out.println(teak + " is eaten");
			int newSteakHealth = this.getHealth() + 1;
			this.setHealth(newSteakHealth);
			wasteSteakProduction();
			System.out.println(this.getHealth() + " is now his health");
			//System.out.println("HELLO");
			return true;

		} else if (enc.storage.foodStore.get(lerey) > 0) {
			enc.storage.takeFood(lerey);
			System.out.println(lerey + " is eaten");
			wasteCeleryProduction();
			System.out.println(this.getHealth() + " is now his health");
			//System.out.println("HELLO 2");
			return true;

		} else {

			System.out.println("No food available");
			return false;
		}

	}
	
	public void wasteCeleryProduction() {
		enc.addWaste(1);
		System.out.println("1 wastage produced by eating celery");

	}

	public void wasteSteakProduction() {
		enc.addWaste(4);
		System.out.println("4 wastage produced by eating steak");

	}


	public void stroked() {

		System.out.println("I am stroking a big cat!");

	}

	/**
	 * You already have your abstract Animal class, we now need to create some
	 * specific instances of Animals. We are going to use some further abstract
	 * classes however as some Animals share common eating habits. For each of
	 * your animal classes you will need to write code in the aMonthPasses()
	 * method. A typical month for an animal will follow the following procedure
	 * Reduce health by 2 Eat a piece of food if available Produce an amount of
	 * waste if food eaten.
	 */

	@Override
	public boolean aMonthPasses() {

		// reduce health by 2
		int overallHealth = this.getHealth() - 2;
		System.out.println("Health before this month was " + this.getHealth());
		System.out.println("Health after this month is now " + overallHealth);
		
		return true;

	}

}
