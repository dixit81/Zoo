
public class Lion extends BigCat {

	public Lion(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);

	}

	public Lion() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(24);

	}
	

	/**
	 * May not be needed due to superclass
	 */

	public boolean aMonthPasses() {
		
		eat();
		
		return true;
	}

	@Override
	public void treat() {

		stroked();
		setHealth(getHealth() + 2);
		System.out.println("Lion's health is now " + getHealth());

	}

}
