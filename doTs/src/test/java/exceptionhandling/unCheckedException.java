package exceptionhandling;

public class unCheckedException {

	public static void main(String[] args) {
		int a = 10;

		try {
			System.out.println(a / 0);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(a);
	}

}
