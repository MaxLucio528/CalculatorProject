package calculus;

/**
 * Responsible for doing subtraction operations.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class Subtraction extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Constructor of Subtraction.
	 * @param num float - Numbers to execute the subtraction, here initialized with 0.
	 * @param result double - Will constain the result of the subtraction, here initialized with 0.0.
	 */
	public Subtraction(float num, double result) {
		super(num, result);
	}

	/**
	 * Get the numbers the user defined to do the subtraction and calls the method operation to
	 * execute the subtraction.
	 * @param num float - Numbers to execute the subtraction.
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Subtracts all the numbers defined by the user.
	 */
	@Override
	public void operation() {
		if(result == 0.0) {
			result = num;
		}else {
			result -= num;
		}
	}

	/**
	 * Returns the value of the subtraction made.
	 * @return double - Value of the subtraction.
	 */
	@Override
	public double showResult() {
		return result;
	}

}
