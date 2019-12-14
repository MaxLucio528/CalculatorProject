package calculus;

/**
 * Generalize a calculus operation.
 * @author Max Lucio
 * @version 1.2
 * @since Release 02 of the application.
 */
public abstract class Calculus {
	private float num;
	private double result;
	
	/**
	 * Constructor of the abstract class.
	 * @param num float - Will be the operand of some calculus in subclasses.
	 * @param result double - Will have the result of some calculus in subclasses.
	 */
	public Calculus(float num, double result) {
		this.num = num;
		this.result = result;
	}
	
	/**
	 * Will get numbers to make some mathematic operations in subclasses.
	 * @param num float - Will be used in operations made in subclasses,
	 * throwing the values in result posteriorly.
	 */
	public abstract void getNumbers(float num);
	/**
	 * Executes a calculus operation.
	 */
	public abstract void operation();
	/**
	 * Shows the result of a mathematic operation in subclasses.
	 * @return double - Result of the mathematic operation solicitated by the user.
	 */
	public abstract double showResult();
}
