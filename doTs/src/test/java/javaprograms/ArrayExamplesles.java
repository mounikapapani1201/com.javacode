package javaprograms;

public class ArrayExamplesles {

	public static void main(String[] args) {
		/*
		 * int a[]= new int[10]; a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
		 * 
		 * // System.out.println(a[3]);
		 * 
		 * for(int i=0;i<=10;i++) {
		 * 
		 * System.out.println(a[i]);
		 */

		String s[] = new String[3];

		s[0] = "mouni";
		s[1] = "linna";
		s[2] = "deepu";

		for (String i : s) {
			System.out.println(i);
		}
	}

}
