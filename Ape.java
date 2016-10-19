
public abstract class Ape extends Animal {
	
	int counter;
	String creamice;
	String urift;

	public Ape(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);
	}

	public Ape() {
		setAge(1);
		setGender('f');
		setHealth(2);
		setLifeExpectancy(10);
		
	}
	
	@Override
	public void treat() {
		
		int afterTreat = getHealth() + 4;
		setHealth(afterTreat);
		System.out.println("After treatment, health has increased to " + afterTreat);
		
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
		int overallHealth = getHealth() - 2;
		System.out.println("Health before this month was " + getHealth());
		System.out.println("Health after this month is now " + overallHealth);

		

		return true;
	}

}
