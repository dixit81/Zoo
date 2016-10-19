import java.util.Hashtable;

/*
 * 2 types of Foodstores : enclosure and the big zoo foodstore
 * Enclosure one: animals eat
 * Zoo foodstore: delivered to enclosures
 */

public class Foodstore {

	Hashtable<String, Integer> foodStore;

	public Foodstore() {

		foodStore = new Hashtable<String, Integer>();
		
		//foodStore 

	}

	public void addFood(String foodName, int quantity) {

		if (foodStore.containsKey(foodName)) {

			System.out.println("There is an exisiting stock of this food");

			int value = foodStore.get(foodName);
			value = value + quantity;

			foodStore.put(foodName, value);
			System.out.println("Stock updated");

		} else {

			foodStore.put(foodName, quantity);

			System.out.println(foodName + " is the food and this is the number " + quantity);

		}
	}

	/*
	 * used by the animals when they eat in their Enclosure, and also by the
	 * Zookeepers as they move food from the Zoo foodstore to the Enclosure
	 * foodstore
	 */

	public void takeFood(String foodName) {

		if (foodStore.containsKey(foodName)) {

			System.out.println("The specifed food is available");

			int initialQuantity = foodStore.get(foodName);

			System.out.println("The quantity of the specifed food is " + initialQuantity);

			int finalQuantity = initialQuantity - 1;

			System.out.println("One piece of the food is now taken");

			foodStore.put(foodName, finalQuantity);

			System.out.println("The new quantity is put in place now");

		} else {
			System.out.println("The specified food does not exist");
		}

	}

	public void printStock() {

		System.out.println("Total stock is now: ");
		System.out.print(foodStore);

	}
}
