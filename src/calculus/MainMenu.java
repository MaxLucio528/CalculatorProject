package calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Generates the menu on terminal automatically.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class MainMenu {
	private final String title;
	private final ArrayList<String> options;
	
	/**
	 * Constructor of the class, here the title of the menu and it's options
	 * are defined.
	 */
	public MainMenu() {
		title = "Calculator MX";
		options = new ArrayList<String>();
		options.addAll(Arrays.asList("1 - Sum", "2 - Subtraction", "3 - Multiplication", "4 - Division",
				"5 - Power", "0 - Exit"));
	}
	
	/**
	 * Generates the menu, pulling the info from the String and ArrayList to be
	 * able to generate the menu of the program, it uses a Iterator to go through
	 * the ArrayList in a loop.
	 */
	public void generateMenu() {
		Iterator<String> percorre = options.iterator();
		
		System.out.println(title + "\n");

		while(percorre.hasNext()) { 
			System.out.println(percorre.next());
		}
		
		System.out.println();
		System.out.print("Chose a option: ");
	}
}
