// Java Program to Illustrate ClassNotFoundException
public class GFG {
	
	//ClassNotFoundException is raised in the above program as class “GeeksForGeeks” is not found in the classpath.

	// Main driver method
	public static void main(String args[])
	{

		// Try block to check for exceptions
		try {

			Class.forName("GeeksForGeeks");
		}

		// Catch block to handle exceptions
		catch (ClassNotFoundException ex) {

			// Displaying exceptions on console along with
			// line number using printStackTrace() method
			ex.printStackTrace();
		}
	}
}
