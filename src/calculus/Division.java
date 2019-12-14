package calculus;

/**
 * Responsible for doing division operations.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class Division extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Constructor of Division.
	 * @param num float - Numbers to execute the division, here initialized with 0.
	 * @param result double - Will constain the result of the division, here initialized with 0.0.
	 */
	public Division(float num, double result) {
		super(num, result);
	}

	/**
	 * Get the numbers the user defined to do the division and calls the method operation to
	 * execute the division.
	 * @param num float - Numbers to execute the division.
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Divides all the numbers defined by the user.
	 */
	@Override
	public void operation() {
		if(result == 0.0) {
			result = num;
		}else {
			result /= num;
		}
	}

	/**
	 * Returns the value of the division made.
	 * @return double - Value of the division.
	 */
	@Override
	public double showResult() {
		return result;
	}

}
