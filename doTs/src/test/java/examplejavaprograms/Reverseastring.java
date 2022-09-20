package examplejavaprograms;

public class Reverseastring {

	public static void main(String[] args) {

		String myName = "mounika";
		String rev = "";

		// using concatenation
		/*
		 * int length = myName.length();
		 * 
		 * for (int i = length - 1; i >= 0; i--) { rev = rev + myName.charAt(i);
		 * 
		 * } System.out.println(rev);
		 */

		// using Array
		//1)take name to Cha array
		//2)find length of name using length()
		//3) use for loop within the for loop,capture last character by using charAt() and add it to rev variable

		
		  char a[] = myName.toCharArray();
		  int length = myName.length();
		  for(int i=length-1;i>=0;i--) {
			  rev = rev+myName.charAt(i);
		  
		  }
		  
		  System.out.println(rev);
		 

		// using StringBuffer

		/*
		 * StringBuffer sb = new StringBuffer(myName); System.out.println(sb.reverse());
		 */
	}
}