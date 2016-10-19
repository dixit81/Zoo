import java.util.ArrayList;
import java.util.List;

public class Enclosure {

	static int counter = 0;

	List<Animal> cells; // We will allow our Enclosures to have no more than 20
						// Animals in them
	Foodstore storage; // Each enclosure has its own foodstore and can be
						// transfered from big one
	private int waste; // Waste produced by each animal

	public Enclosure() {

		cells = new ArrayList<Animal>();
		storage = new Foodstore();
		setWaste(0);

		/*
		 * for (int i = 0; i < 20; i++) { cells.add(null); }
		 */

	}

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

	/*
	 * Adds an animal to the enclosure
	 */

	public void addAnimal(Animal animal) {

		if (counter < 20) {

			cells.add(counter, animal);
			counter++;
			System.out.println(animal.toString() + "added to enclosure");

		} else {

			System.out.println("Not enough space to fit");

		}

	}

	/*
	 * Removes an animal out of the enclosure
	 */

	public void removeAnimal(Animal animal) {

		if (cells.contains(animal)) {

			int position = cells.indexOf(animal);
			cells.set(position, null);

			System.out.println("Specified animal is now removed");
		}

	}

	/*
	 * removes the specified amount of waste from the Enclosure.
	 */

	public void removeWaste(int waste) {

		System.out.println("Total waste to be removed is " + waste);
		System.out.println("Current waste is " + getWaste());
		int newWaste = getWaste() - waste;
		System.out.println("Remaining waste after removal is " + newWaste);
		setWaste(newWaste);
		System.out.println("Getting new waste value " + getWaste());
	}

	/*
	 * adds an amount of waste (if animal has eaten).
	 */

	public void addWaste(int waste) {

		System.out.println("Total waste to be added is " + waste);
		System.out.println("Current waste is " + getWaste());
		int newWaste = getWaste() + waste;
		System.out.println("Remaining waste after addition is " + newWaste);
		setWaste(newWaste);
		System.out.println("Getting new waste value " + getWaste());

	}

	/*
	 * Returns waste
	 */

	public int getWasteSize() {

		return getWaste();

	}

	/*
	 * returns the Foodstore for the Enclosure.
	 */

	public Foodstore getFoodstore() {

		return storage;

	}

	public int size() {

		int cellSize = cells.size();
		System.out.println("The total number of animals are " + cellSize);
		return cellSize;

	}
	
	public boolean aMonthPasses() {
		
		for(Animal an: cells) {
			
			System.out.println("Calling aMonthPasses() on animals");
			an.aMonthPasses();
			
		}
		
		return true;
		
	}

	@Override
	public String toString() {
		return "Enclosure [cells=" + cells + ", storage=" + storage + ", waste=" + waste + "]";
	}

}
