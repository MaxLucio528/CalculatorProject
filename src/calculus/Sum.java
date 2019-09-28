package calculus;

/**
 * Subclasse de Calculus que é responsável por fazer operações de adição.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicação
 */
public class Sum extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Método construtor de Sum, que apenas inicializa ambos os atributos.
	 * @author Max Lucio
	 * @param num float - Números para executar a soma, aqui inicializado com 0
	 * @param result double - Número que contêm o resultado da soma, aqui inicializado com 0.0
	 */
	public Sum(float num, double result) {
		super(num, result);
	}
	
	/**
	 * Método que pega os números que o usuário definiu para a fazer a soma e que chama o
	 * método operation para executar a soma.
	 * @author Max Lucio
	 * @param num float - Números para executar a soma
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Método que soma todos os números definidos pelo usuário.
	 * @author Max Lucio
	 */
	@Override
	public void operation() {
		if(result == 0.0) {
			result = num;
		}else {
			result += num;
		}
	}

	/**
	 * Método que retorna o valor da soma efetuada.
	 * @author Max Lucio
	 * @return double - Valor da soma efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}
}
