package javaprograms;

public class swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;

		c = a;// c=10
		a = b;// a=20
		b = c;// b=10

		System.out.println("value of a after swapping:" + a);
		System.out.println("value of b after swapping:" + b);

		// swapping varaiables without using third variable

		int x = 10;
		int y = 20;
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("value of x after swapping:" + x);
		System.out.println("value of y after swapping:" + y);
	}

}
