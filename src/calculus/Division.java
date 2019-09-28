package calculus;

/**
 * Subclasse de Calculus que � respons�vel por fazer opera��es de divis�o.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplica��o
 */
public class Division extends Calculus {
	private float num;
	private double result;
	
	/**
	 * M�todo construtor de Division, que apenas inicializa ambos os atributos.
	 * @author Max Lucio
	 * @param num float - N�meros para executar a divis�o, aqui inicializado com 0
	 * @param result double - N�mero que cont�m o resultado da divis�o, aqui inicializado com 0.0
	 */
	public Division(float num, double result) {
		super(num, result);
	}

	/**
	 * M�todo que pega os n�meros que o usu�rio definiu para a fazer a divis�o e que chama o
	 * m�todo operation para executar a divis�o.
	 * @author Max Lucio
	 * @param num float - N�meros para executar a divis�o
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * M�todo que divide todos os n�meros definidos pelo usu�rio.
	 * @author Max Lucio
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
	 * M�todo que retorna o valor da divis�o efetuada.
	 * @author Max Lucio
	 * @return double - Valor da divis�o efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
