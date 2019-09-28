package calculus;

/**
 * Subclasse de Calculus que é responsável por fazer operações de divisão.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicação
 */
public class Division extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Método construtor de Division, que apenas inicializa ambos os atributos.
	 * @author Max Lucio
	 * @param num float - Números para executar a divisão, aqui inicializado com 0
	 * @param result double - Número que contêm o resultado da divisão, aqui inicializado com 0.0
	 */
	public Division(float num, double result) {
		super(num, result);
	}

	/**
	 * Método que pega os números que o usuário definiu para a fazer a divisão e que chama o
	 * método operation para executar a divisão.
	 * @author Max Lucio
	 * @param num float - Números para executar a divisão
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Método que divide todos os números definidos pelo usuário.
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
	 * Método que retorna o valor da divisão efetuada.
	 * @author Max Lucio
	 * @return double - Valor da divisão efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
