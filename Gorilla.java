
public class Gorilla extends Ape {

	public Gorilla(int age, char gender, String[] eats, int health, int lifeExpectancy) {
		super(age, gender, eats, health, lifeExpectancy);
	}
	
	public Gorilla() {
		setAge(1);
		setGender('m');
		setHealth(10);
		setLifeExpectancy(32);
	}

	@Override
	public boolean eat() {

		creamice = "ice cream";
		urift = "fruit";

		if (enc.storage.foodStore.get(creamice) > 0) {
			enc.storage.takeFood(creamice);
			int newIceHealth = this.getHealth() + 1;
			this.setHealth(newIceHealth);
			enc.addWaste(4);
			System.out.println(creamice + " is eaten");
			System.out.println(this.getHealth() + " is now his health");
			System.out.println("4 wastage produced by eating ice cream");

			return true;
		} else if (enc.storage.foodStore.get(urift) > 0) {
			enc.storage.takeFood(urift);
			int newFruitHealth = this.getHealth() + 2;
			this.setHealth(newFruitHealth);
			enc.addWaste(3);
			System.out.println(urift + " is eaten");
			System.out.println("3 wastage produced by eating fruit");
			return true;
		} else {
			System.out.println("No food available!");
			System.out.println("Health and waste unchanged");
			return false;
		}

	}
	
	public void painting() {
		
		System.out.println("The gorilla has now painted!");
		
	}
	
	public void treat() {
		
		painting();
		
	}

	/**
	 * May not be needed due to superclass
	 */

	public boolean aMonthPasses() {
		
		eat();
		
		return true;
	}

}
