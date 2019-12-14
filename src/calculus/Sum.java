package calculus;

/**
 * Responsible for doing sum operations.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class Sum extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Constructor of Sum.
	 * @param num float - Numbers to execute the sum, here initialized with 0.
	 * @param result double - Will constain the result of the sum, here initialized with 0.0.
	 */
	public Sum(float num, double result) {
		super(num, result);
	}
	
	/**
	 * Get the numbers the user defined to do the sum and calls the method operation to
	 * execute the sum.
	 * @param num float - Numbers to execute the sum.
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Sums all the numbers defined by the user.
	 */
	@Override
	public void operation() {
		if(result == 0.0) {
			result = num;
		}else {
			result += num;
		}
	}

	/**
	 * Returns the value of the sum made.
	 * @return double - Value of the sum.
	 */
	@Override
	public double showResult() {
		return result;
	}
}
