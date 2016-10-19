import java.util.Hashtable;

public class Main {

	static Zoo z = new Zoo();

	public static void testAnimals() {
		Lion var1 = new Lion();
		assertEquals("Expecting 1 from getAge() as a default value", var1.getAge(), 1);
		Bear var2 = new Bear();
		assertEquals("Expecting f from var2.getGender() as a default value", var2.getGender(), 'f');
		var2.decreaseHealth();
		System.out.println("[PASS] Decreased the health of the bear.");
		passed++;
	}

	public static void testFoodstore() {
		Foodstore var5 = new Foodstore();
		System.out.println("[PASS] Created foodstore");
		passed++;
		var5.addFood("steak", 5);
		System.out.println("[PASS] Added steak");
		passed++;
		var5.addFood("pizza", 10);
		System.out.println("[PASS] Added pizza?");
		passed++;
		var5.takeFood("steak");
		System.out.println("[PASS] Eat steak");
		passed++;
	}

	public static void testEnclosures() {
		Enclosure e = new Enclosure();
		Lion var3 = new Lion();
		e.addAnimal(var3);
		var3.setEnclosure(e);
		Lion var4 = new Lion();
		e.addAnimal(var4);
		var4.setEnclosure(e);
		// assertEquals("Expecting 2 from e.size() i.e. 2 animals", e.size(),
		// 2);
		Chimpanzee k = new Chimpanzee();
		e.addAnimal(k);
		k.setEnclosure(e);
		assertEquals("Expecting 3 from e.size()", e.size(), 3);
		Foodstore f = e.getFoodstore();
		System.out.println("[PASS] Got the foodstore of the enclosure");
		passed++;
		f.addFood("steak", 10);
		var3.eat();
		System.out.println("[PASS] The lion ate.");
		passed++;
		var4.aMonthPasses();
		System.out.println("[PASS] a month passed for the other lion.");
		passed++;
		assertEquals("Expecting 8 from e.getWasteSize()", e.getWasteSize(), 8);
	}

	static int passed = 0;
	static int failed = 0;

	public static void go() {
		
		Enclosure stand1 = new Enclosure();
		System.out.println("Enclosure stand 1");
		Tiger t1 = new Tiger();
		System.out.println("New tiger brought");
		stand1.addAnimal(t1);
		System.out.println(t1.toString() + " added to stand 1");
		t1.setEnclosure(stand1);
		System.out.println(t1.toString() + " set to stand 1 only");
		
		Lion l1 = new Lion();
		System.out.println("Lion bought");
		stand1.addAnimal(l1);
		System.out.println(l1.toString() + " added to stand 1");
		l1.setEnclosure(stand1);
		System.out.println(t1.toString() + " set to stand 1 only");
		
		Bear bar = new Bear();
		stand1.addAnimal(bar);
		System.out.println(t1.toString() + " added to stand 1");
		t1.setEnclosure(stand1);
		System.out.println(t1.toString() + " set to stand 1 only");
		
		z.aMonthPasses();
	}

	public static void main(String[] args) {
		/*
		 * testFoodstore(); testAnimals(); testEnclosures(); if (failed > 0)
		 * System.out.println("Unpredicted outputs!"); System.out.println(
		 * "Tests run: " + (passed + failed) + ",  Failures: " + failed);
		 */
		try {
			Thread.sleep(500);
			go();
		} catch (InterruptedException e) {
			e.getStackTrace();
		}

	}

	private static void assertEquals(String message, Object expected, Object actual) {
		if ((expected != null && expected.equals(actual)) || (expected == null && actual == null)) {
			System.out.println("[PASS] " + message);
			passed++;
		} else {
			System.out.println("[FAIL] " + message);
			failed++;
		}
	}

	private static void fail(String message) {
		System.out.println("[FAIL] " + message);
		failed++;
	}

	/*
	 * Animal w = new Wolf(12, 'm', eatin, 1, 15);
	 * 
	 * int age = w.getAge(); System.out.println(age);
	 * 
	 * Foodstore f = new Foodstore();
	 * 
	 * System.out.println(); f.addFood("hay", 3); f.addFood("steak", 4);
	 * f.addFood("fruit", 2); System.out.println(); f.printStock();
	 * System.out.println(); f.takeFood("fruit"); System.out.println();
	 * f.printStock(); System.out.println(); f.takeFood("hay");
	 * System.out.println(); f.addFood("fish", 6); f.addFood("hay", 4);
	 * System.out.println(); f.printStock();
	 * 
	 * Enclosure e = new Enclosure();
	 * 
	 * for(int i=0; i<21; i++) { e.addAnimal(w); }
	 * 
	 * for(Animal x: e.cells) { System.out.println(x); }
	 * 
	 */

}
