package calculus;

import java.util.InputMismatchException;

/**
 * Initializes the program, redirecting to another class that executes the processes
 * of the execution.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class StartProgram {
	
	/**
	 * Responsible for the initialization of the program and that treats eventual
	 * exceptions that may occur.
	 * @param args String[] - Standard parameter of Java main function.
	 */
	public static void main(String[] args) {
		try {
			ProgramExecution program = new ProgramExecution();
			program.process();
		}
		catch(InputMismatchException e) {
			System.out.println("\nError! You need to type a number! " + e.toString() + "\n");
			StartProgram.main(args);
		}
		catch(Exception e) {
			System.out.println("\nError! Something went wrong because of " + e.toString() + "\n");
			StartProgram.main(args);
		}
	}

}
