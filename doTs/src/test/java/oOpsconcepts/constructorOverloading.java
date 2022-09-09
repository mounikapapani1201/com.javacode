package oOpsconcepts;

public class constructorOverloading {

	int a = 1;
	int b = 2;
	double c = 2.1;

	constructorOverloading() {
		a = 10;
		b = 20;
		c = 30.5;
	}

	constructorOverloading(int x, int y) {
		a = x;
		b = y;
	}

	constructorOverloading(int x, int y, double z) {
		a = x;
		b = y;
		c = z;
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	public static void main(String[] args) {

		// constructorOverloading co = new constructorOverloading();
		//constructorOverloading co = new constructorOverloading(10, 20);
		constructorOverloading co = new constructorOverloading(10, 20, 20.2);
		co.display();

	}

}
