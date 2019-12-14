package calculus;

/**
 * Responsible for doing power operations.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public class Power extends Calculus {
	private float num;
	private float exp;
	private double result;
	
	/**
	 * Constructor of Power.
	 * @param num float - Number to execute the power, here initialized with 0.
	 * @param exp float - Exponent to execute the power, here initialized with 0.
	 * @param result double - Will constain the result of the power, here initialized with 0.0.
	 */
	public Power(float num, float exp, double result) {
		super(num, result);
		this.exp = exp;
	}

	/**
	 * Get the numbers the user defined to do the power.
	 * @param num float - Number to execute the power.
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
	}
	
	/**
	 * Gets the exponent the user degined to do the power and calls the method operation to
	 * execute the power.
	 * @param exp float - Power's exponent.
	 */
	public void getExponent(float exp) {
		this.exp = exp;
		operation();
	}

	/**
	 * Executes the power based on the numbers defined by the user.
	 */
	@Override
	public void operation() {
		result = Math.pow(num, exp);
	}

	/**
	 * Returns the value of the power made.
	 * @return double - Value of the power.
	 */
	@Override
	public double showResult() {
		return result;
	}

}
