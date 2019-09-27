package calculus;

/**
 * Subclasse de Calculus que � respons�vel por fazer opera��es de multiplica��o.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public class Multiplication extends Calculus{
	private float[] num;
	private double result;
	
	/**
	 * M�todo construtor de Multiplication, que apenas inicializa ambos os atributos.
	 * @author Max Lucio
	 * @param num float[] - N�meros para executar a multiplica��o, aqui inicializado com null
	 * @param result double - N�mero que cont�m o resultado da multiplica��o, aqui inicializado com 0.0
	 */
	public Multiplication(float[] num, double result) {
		super(num, result);
	}

	/**
	 * M�todo que pega os n�meros que o usu�rio definiu para a fazer a multiplica��o.
	 * @author Max Lucio
	 * @param num float[] - N�meros para executar a multiplica��o
	 */
	@Override
	public void getNumbers(float[] num) {
		this.num = num;
	}

	/**
	 * M�todo que multiplica��o todos os n�meros definidos pelo usu�rio.
	 * @author Max Lucio
	 */
	@Override
	public void operation() {
		result = num[0];
		
		for(int i = 1; i < num.length; i++) {
			result *= num[i];
		}
	}

	/**
	 * M�todo que retorna o valor da multiplica��o efetuada.
	 * @author Max Lucio
	 * @return double - Valor da multiplica��o efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}