package methodOverriding;

public class chiClass extends parClass {

	int getRateofinterest() {
		return 10;

	}

	public static void main(String[] args) {
		parClass interest = new chiClass ();

		System.out.println(interest.getRateofinterest());

	}

}
