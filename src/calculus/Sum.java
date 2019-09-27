package calculus;

/**
 * Subclasse de Calculus que � respons�vel por fazer opera��es de adi��o.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public class Sum extends Calculus {
	private float[] num;
	private double result;
	
	/**
	 * M�todo construtor de Sum, que apenas inicializa ambos os atributos.
	 * @author Max Lucio
	 * @param num float[] - N�meros para executar a soma, aqui inicializado com null
	 * @param result double - N�mero que cont�m o resultado da soma, aqui inicializado com 0.0
	 */
	public Sum(float[] num, double result) {
		super(num, result);
	}
	
	/**
	 * M�todo que pega os n�meros que o usu�rio definiu para a fazer a soma.
	 * @author Max Lucio
	 * @param num float[] - N�meros para executar a soma
	 */
	@Override
	public void getNumbers(float[] num) {
		this.num = num;
	}

	/**
	 * M�todo que soma todos os n�meros definidos pelo usu�rio.
	 * @author Max Lucio
	 */
	@Override
	public void operation() {
		result = num[0];
		
		for(int i = 1; i < num.length; i++) {
			result += num[i];
		}
	}

	/**
	 * M�todo que retorna o valor da soma efetuada.
	 * @author Max Lucio
	 * @return double - Valor da soma efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}
}
