
public class Tiger extends BigCat {

	public Tiger(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);
	}
	
	public Tiger() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(24);
	}

	/**
	 * May not be needed due to superclass
	 */

	public boolean aMonthPasses() {
		
		//if the animal has eaten
		eat();
		
		return true ;
	}

	@Override
	public void treat() {

		stroked();
		setHealth(getHealth() + 2);
		System.out.println("Lion's health is now " + getHealth());

	}

}
