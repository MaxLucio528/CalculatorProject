package calculus;

/**
 * Subclasse de Calculus que � respons�vel por fazer opera��es de potencia��o.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public class Power extends Calculus {
	private float num;
	private float exp;
	private double result;
	
	/**
	 * M�todo construtor de Power, que apenas inicializa os tr�s atributos.
	 * @param num float - Base para executar a pot�ncia, aqui inicializado com 0
	 * @param exp float - Expoente para executar a pot�ncia, aqui inicializado com 0
	 * @param result double - N�mero que cont�m o resultado da soma, aqui inicializado com 0.0
	 */
	public Power(float num, float exp, double result) {
		super(num, result);
		this.exp = exp;
	}

	/**
	 * M�todo que pega a base que o usu�rio definiu para a fazer a pot�ncia.
	 * @param num float - N�mero para executar a pot�ncia
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
	}
	
	/**
	 * M�todo que pega o expoente que o usu�rio definiu para a fazer a pot�ncia e que chama o
	 * m�todo operation para executar a potencia��o.
	 * @param exp float - Expoente da pot�ncia
	 */
	public void getExponent(float exp) {
		this.exp = exp;
		operation();
	}

	/**
	 * M�todo que executa o c�lculo da pot�ncia.
	 */
	@Override
	public void operation() {
		result = Math.pow(num, exp);
	}

	/**
	 * M�todo que retorna o valor da pot�ncia efetuada.
	 * @return double - Valor da pot�ncia efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
