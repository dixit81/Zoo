import java.util.ArrayList;

public class Zoo {

	/**
	 * It should have an Array of Enclosures and later on, an ArrayList of
	 * Zookeepers. It should have a aMonthPasses() method which is used to run
	 * the Simulation
	 */

	ArrayList<Enclosure> enclosures;
	Foodstore zooFoodstore;

	public Zoo() {

		enclosures = new ArrayList<Enclosure>();
		zooFoodstore = new Foodstore();

	}

	public Foodstore getZooFoodstore() {
		return zooFoodstore;
	}


	/*
	 * Each Enclosure will have aMonthPasses() called on it. This will in turn
	 * then call the method on all the Animals in the Enclosure
	 * 
	 * Each Zookeeper (once these have been implemented) will have
	 * aMonthPasses() called on it. This will allow them to perform their
	 * duties.
	 * 
	 * Each Animal in the zoo will be checked to see if its health is 0. If so,
	 * it will be removed from the zoo.
	 * 
	 * The zoo Foodstore can be restocked.
	 */

	public boolean aMonthPasses() {

		System.out.println("Hello");
		for (Enclosure en : enclosures) {
			System.out.println("Calling aMonthPasses() on enclosures");
			en.aMonthPasses();

			System.out.println("Getting each animal health");
			for (int i = 0; i < en.size(); i++) {
				int animalHealth = en.cells.get(i).getHealth();
				if (animalHealth == 0) {
					en.removeAnimal(en.cells.get(i));
					System.out.println(en.cells.get(i).toString() + "is now removed from the enclosure");
				} else {
					System.out.println("The animal health is now " + animalHealth);
				}
			}

		}

		getZooFoodstore().printStock();
		getZooFoodstore().addFood("test", 1);
		
		return true;

	}

}
