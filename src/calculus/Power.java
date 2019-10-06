package calculus;

/**
 * Subclasse de Calculus que e responsavel por fazer operacoes de potenciacao.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplicacao
 */
public class Power extends Calculus {
	private float num;
	private float exp;
	private double result;
	
	/**
	 * Metodo construtor de Power, que apenas inicializa os tres atributos.
	 * @param num float - Base para executar a potencia, aqui inicializado com 0
	 * @param exp float - Expoente para executar a potencia, aqui inicializado com 0
	 * @param result double - Numero que contem o resultado da soma, aqui inicializado com 0.0
	 */
	public Power(float num, float exp, double result) {
		super(num, result);
		this.exp = exp;
	}

	/**
	 * Metodo que pega a base que o usuario definiu para a fazer a potencia.
	 * @param num float - Numero para executar a potencia
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
	}
	
	/**
	 * Metodo que pega o expoente que o usuario definiu para a fazer a potencia e que chama o
	 * metodo operation para executar a potenciacao.
	 * @param exp float - Expoente da potencia
	 */
	public void getExponent(float exp) {
		this.exp = exp;
		operation();
	}

	/**
	 * Metodo que executa o calculo da potencia.
	 */
	@Override
	public void operation() {
		result = Math.pow(num, exp);
	}

	/**
	 * Metodo que retorna o valor da potencia efetuada.
	 * @return double - Valor da potencia efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
