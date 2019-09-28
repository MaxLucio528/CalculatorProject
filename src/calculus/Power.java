package calculus;

/**
 * Subclasse de Calculus que é responsável por fazer operações de potenciação.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class Power extends Calculus {
	private float num;
	private float exp;
	private double result;
	
	/**
	 * Método construtor de Power, que apenas inicializa os três atributos.
	 * @param num float - Base para executar a potência, aqui inicializado com 0
	 * @param exp float - Expoente para executar a potência, aqui inicializado com 0
	 * @param result double - Número que contêm o resultado da soma, aqui inicializado com 0.0
	 */
	public Power(float num, float exp, double result) {
		super(num, result);
		this.exp = exp;
	}

	/**
	 * Método que pega a base que o usuário definiu para a fazer a potência.
	 * @param num float - Número para executar a potência
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
	}
	
	/**
	 * Método que pega o expoente que o usuário definiu para a fazer a potência e que chama o
	 * método operation para executar a potenciação.
	 * @param exp float - Expoente da potência
	 */
	public void getExponent(float exp) {
		this.exp = exp;
		operation();
	}

	/**
	 * Método que executa o cálculo da potência.
	 */
	@Override
	public void operation() {
		result = Math.pow(num, exp);
	}

	/**
	 * Método que retorna o valor da potência efetuada.
	 * @return double - Valor da potência efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
