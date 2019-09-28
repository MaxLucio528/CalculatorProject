package calculus;

/**
 * Subclasse de Calculus que é responsável por fazer operações de subtração.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicação
 */
public class Subtraction extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Método construtor de Subtraction, que apenas inicializa ambos os atributos.
	 * @param num float - Números para executar a subtração, aqui inicializado com 0
	 * @param result double - Número que contêm o resultado da subtração, aqui inicializado com 0.0
	 */
	public Subtraction(float num, double result) {
		super(num, result);
	}

	/**
	 * Método que pega os números que o usuário definiu para a fazer a subtração e que chama o
	 * método operation para executar a subtração.
	 * @param num float - Números para executar a subtração
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Método que subtrai todos os números definidos pelo usuário.
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
	 * Método que retorna o valor da subtração efetuada.
	 * @return double - Valor da subtração efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
