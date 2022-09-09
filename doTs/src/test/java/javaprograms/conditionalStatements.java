package javaprograms;

public class conditionalStatements {

	public static void main(String[] args) {

		// if condition
		int age = 12;

		if (age >= 18) {
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}

		System.out.println("program executed");

		// nested if

		int day = 7;

		if (day == 1) {
			System.out.println("sunday");
		}

		else if (day == 2) {
			System.out.println("monday");
		}

		else if (day == 3) {
			System.out.println("tuesday");
		}

		else if (day == 4) {
			System.out.println("wednesday");
		}

		else if (day == 5) {
			System.out.println("thursday");
		}

		else if (day == 6) {
			System.out.println("friday");
		}

		else {
			System.out.println("saturday");
		}

	
		
		
	}

}
