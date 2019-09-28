package calculus;

/**
 * Subclasse de Calculus que � respons�vel por fazer opera��es de subtra��o.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplica��o
 */
public class Subtraction extends Calculus {
	private float num;
	private double result;
	
	/**
	 * M�todo construtor de Subtraction, que apenas inicializa ambos os atributos.
	 * @param num float - N�meros para executar a subtra��o, aqui inicializado com 0
	 * @param result double - N�mero que cont�m o resultado da subtra��o, aqui inicializado com 0.0
	 */
	public Subtraction(float num, double result) {
		super(num, result);
	}

	/**
	 * M�todo que pega os n�meros que o usu�rio definiu para a fazer a subtra��o e que chama o
	 * m�todo operation para executar a subtra��o.
	 * @param num float - N�meros para executar a subtra��o
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * M�todo que subtrai todos os n�meros definidos pelo usu�rio.
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
	 * M�todo que retorna o valor da subtra��o efetuada.
	 * @return double - Valor da subtra��o efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
