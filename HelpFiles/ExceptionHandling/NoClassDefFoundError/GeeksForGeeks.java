// Java Program to Illustrate NoClassDefFoundError Exception

// Class 1
// Helper class
class GeeksForGeeks {

	// Method
	void greeting()
	{
		// Print statement whenever method is called
		System.out.println("hello!");
	}
}

// Class 2
// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// Creating object of class 1
		// inside main() in class2
		GeeksForGeeks geeks = new GeeksForGeeks();

		// Calling method of above class
		geeks.greeting();
	}
}


/*
Output explanation: 

Above program will be successfully compiled and generated two classes ‘GeeksForGeeks.class’ and ‘GFG.class.’ Now remove GeeksForGeeks.class file and run GFG.class when we saw that at Java runtime NoClassDefFoundError will be thrown.
*/