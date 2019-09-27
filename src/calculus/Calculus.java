package calculus;

/**
 * Classe abstrata que generaliza uma opera��o de c�lculo
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public abstract class Calculus {
	private float[] num;
	private double result;
	
	/**
	 * Construtor da classe abstrata, que � chamado pelas subclasses
	 * deste programa.
	 * @author Max Lucio
	 * @param num float[] - N�meros que ir�o executar algum c�lculo em subclasses
	 * @param result double - Resultado de algum c�lculo efetuado em subclasses
	 */
	public Calculus(float[] num, double result) {
		this.num = num;
		this.result = result;
	}
	
	/**
	 * M�todo abstrato que em subclasses ir� pegar os n�meros para efetuar
	 * alguma opera��o matem�tica.
	 * @author Max Lucio
	 * @param num float[] - N�meros que ir�o ser usados em opera��es feitas em subclasses
	 */
	public abstract void getNumbers(float[] num);
	/**
	 * M�todo abstrato que em subclasses, ir� executar a opera��o de algum c�lculo.
	 * @author Max Lucio
	 */
	public abstract void operation();
	/**
	 * M�todo abstrato que em subclasses, ir� mostrar o resultado de uma opera��o
	 * matem�tica. 
	 * @author Max Lucio
	 * @return double - Resultado da opera��o matem�tica solicitada pelo usu�rio
	 */
	public abstract double showResult();
}
