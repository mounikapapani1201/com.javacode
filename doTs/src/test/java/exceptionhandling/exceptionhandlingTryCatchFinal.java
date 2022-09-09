package exceptionhandling;

public class exceptionhandlingTryCatchFinal {

	public static void main(String[] args) {
		int s[]=new int[5];
		try {
			s[10]=25;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	 

	}

}
