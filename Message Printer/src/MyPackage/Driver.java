package MyPackage;

public class Driver {

	public static void main(String[] args) {
		String myMessage = "Hello!"; // This is called a String Literal, named for the manually-entered value
		int runIterations = 5;
		
		for(int i = 0; i < runIterations ; ++i) {
			System.out.println(myMessage + ": " + i);
		}
	}
}
