package TestNG;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class sample {
	
	


	public static void main(String[] args) throws Exception {

		System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\output.txt")));
		System.out.println("This is test output");
			

	}

}
