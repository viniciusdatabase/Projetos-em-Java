package entities;

public class Student {

	// the lion fears no class exercise

	public String name;
	public float g1, g2, g3, totalSum;

	public void somatory() {

		totalSum = g1 + g2 + g3;

		if (totalSum >= 60) {

			System.out.println("Final Grade = " + totalSum);
			System.out.println("PASS");

		}

		else {

			float howMuch;

			howMuch =  60 - totalSum  ;

			System.out.println("Final grade = " + totalSum);
			System.out.println("FAILED");
			System.out.println("Missing " + howMuch + " points");

		}

	}

}
