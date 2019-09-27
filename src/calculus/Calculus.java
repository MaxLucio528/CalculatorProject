package calculus;

/**
 * Classe abstrata que generaliza uma operação de cálculo
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplicação
 */
public abstract class Calculus {
	private float[] num;
	private double result;
	
	/**
	 * Construtor da classe abstrata, que é chamado pelas subclasses
	 * deste programa.
	 * @author Max Lucio
	 * @param num float[] - Números que irão executar algum cálculo em subclasses
	 * @param result double - Resultado de algum cálculo efetuado em subclasses
	 */
	public Calculus(float[] num, double result) {
		this.num = num;
		this.result = result;
	}
	
	/**
	 * Método abstrato que em subclasses irá pegar os números para efetuar
	 * alguma operação matemática.
	 * @author Max Lucio
	 * @param num float[] - Números que irão ser usados em operações feitas em subclasses
	 */
	public abstract void getNumbers(float[] num);
	/**
	 * Método abstrato que em subclasses, irá executar a operação de algum cálculo.
	 * @author Max Lucio
	 */
	public abstract void operation();
	/**
	 * Método abstrato que em subclasses, irá mostrar o resultado de uma operação
	 * matemática. 
	 * @author Max Lucio
	 * @return double - Resultado da operação matemática solicitada pelo usuário
	 */
	public abstract double showResult();
}
