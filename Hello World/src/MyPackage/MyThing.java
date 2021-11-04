package MyPackage;

public class MyThing {
	
	
	
	/*
	 * Camel Case: firstLetterLowerCase
	 * Pascal Case: Capitalize first letter of every word, no spaces
	 * 
	 * Alternate naming strategies:
	 * Snake Case: under_scores_separating_words, no spaces or caps
	 * Kebab Case: hyphens-separating-words, no spaces or caps
	 */
	
	//Primitive Data types 
	// whole number
	short mySmallNumber; // Half of an int. 16 bits
	long myBigNumber; // 64 bit, twice as large as an int
	byte myByte; // 8 bits, half of an short
	int myWholeNumber; // Short for 'integer' . 32 bits. Whole numbers only
	
	// Decimal
	float myDecimal = 1.05f;; // 'Floating-point or decimal number. 32 bits. Notoriously inaccurate
	double myMorePreciseDecimal; // 64 bits bits, double precision decimal number
	
	// True / false
	boolean myTrueOrFalse; // 1 byte or 8 bits
	
	
	// Character
	 char myCharacter; // 16 bits, stores ASCII unless otherwise specified
	 
	// Reference- holds the memory address of some object
	 Object o; // References are 32 bits on a x86 (32-bit machine) and 64 bits on a 
	 
	 // My first method. Prints a string that contains some of the values of this class
	 public void PrintMyValues() {
		 System.out.println("My values are: "+ myByte + ", "+ mySmallNumber + ", " + myDecimal);
		 
		 mt.PrintMyValues();
	 }
}
