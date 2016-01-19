/**
 * 
 */
package exercise1_src;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author EugeneC
 *
 */
public class JavaMain {

	// private static ArrayList alResponses;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Define Resources
		 */
		Scanner scanner = new Scanner(System.in);

		/*
		 * Code GUI Message boxes
		 */
		String name = JOptionPane.showInputDialog("Hello, What is your name ",
				"");
		String sAge = JOptionPane.showInputDialog("Hello, " + name
				+ " How Old are you", "");
		int iAge = new Integer(sAge);
		int iBirthYear = 2016 - iAge;
		JOptionPane.showInputDialog("Were you born in " + iBirthYear + "?");

		/*
		 * Console implementation
		 * 
		 * System.out.println (name);
		 * System.out.println("Hello, Whats your name?");
		 * 
		 * String sResponse = s.nextLine();
		 * 		s.close();
		 * System.out.println("Hello " + sResponse + ", How old are you?");
		 * 
		 * String sAge = s.nextLine();
		 * 		s.close();
		 * int iAge = new Integer(sAge); 
		 * int iBirthYear = 2016 - iAge;
		 * 
		 * System.out.println("Interesting you were born in " + iBirthYear);
		 */


	}

}
