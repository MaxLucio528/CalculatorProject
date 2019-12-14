package calculus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Responsible for the program execution.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class ProgramExecution {

	/**
	 * Executes all the processes of the program, recieving the numbers the user will
	 * do the calculus and redirecting to the classes that executes the mathematical
	 * opeations.
	 * @throws InputMismatchException - Exception thrown if the user types anything that
	 * isn't a number.
	 */
	public void process() throws InputMismatchException {
		int op;
		double result;
		String num;
		String exp;
		Scanner input = new Scanner(System.in);
		MainMenu menu = new MainMenu();
		ArrayList<Calculus> calculus = new ArrayList<Calculus>();
		calculus.add(new Sum(0, 0.0));
		calculus.add(new Subtraction(0, 0.0));
		calculus.add(new Multiplication(0, 0.0));
		calculus.add(new Division(0, 0.0));
		calculus.add(new Power(0, 0, 0.0));
		
		do {
			menu.generateMenu();
			
			op = input.nextInt();
			input.nextLine();
			
			if(op == 0) {
				System.out.println("\nProgram terminated...\n");
				break;
			}
			
			switch(op) {
				case 1:
					System.out.println("\nType the numbers you'll sum (Type '=' to get the result): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(0).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					
					result = calculus.get(0).showResult();
					
					System.out.println("\nThe result of the sum is: " + result + "\n");
				break;
				case 2:
					System.out.println("\nType the numbers you'll subtract (Type '=' to get the result): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(1).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(1).showResult();
					
					System.out.println("\nThe result of the subtraction is: " + result + "\n");
				break;
				case 3:
					System.out.println("\nType the numbers you'll multiplicate (Type '=' to get the result): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(2).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(2).showResult();
					
					System.out.println("\nThe result of the multiplication is: " + result + "\n");
				break;
				case 4:
					System.out.println("\nType the numbers you'll divide (Type '=' to get the result): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(3).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(3).showResult();
					
					System.out.println("\nThe result of the division is: " + result + "\n");
				break;
				case 5:
					System.out.println("\nType the base of the power: ");
					
					num = input.nextLine();
						
					System.out.println("\nType the exponent of the power: ");
						
					exp = input.nextLine();
						
					calculus.get(4).getNumbers(Float.parseFloat(num));
					((Power) calculus.get(4)).getExponent(Float.parseFloat(exp));
					
					result = calculus.get(4).showResult();
					
					System.out.println("\nThe result of the power is: " + result + "\n");
				break;
				default:
					System.out.println("\nInvalid Option! Try again...\n");
			}
		}while(op != 0);
		
		input.close();
	}
}
