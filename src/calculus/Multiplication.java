package calculus;

/**
 * Responsible for doing multiplication operations.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class Multiplication extends Calculus{
	private float num;
	private double result;
	
	/**
	 * Constructor of Multiplication.
	 * @param num float - Numbers to execute the multiplication, here initialized with 0.
	 * @param result double - Will constain the result of the multiplication, here initialized with 0.0.
	 */
	public Multiplication(float num, double result) {
		super(num, result);
	}

	/**
	 * Get the numbers the user defined to do the multiplication and calls the method operation to
	 * execute the division.
	 * @param num float - Numbers to execute the multiplication.
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Multiplies all the numbers defined by the user.
	 */
	@Override
	public void operation() {
		if(result == 0.0) {
			result = num;
		}else {
			result *= num;
		}
	}

	/**
	 * Returns the value of the multiplication made.
	 * @return double - Value of the multiplication.
	 */
	@Override
	public double showResult() {
		return result;
	}

}
