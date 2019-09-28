package calculus;

/**
 * Subclasse de Calculus que é responsável por fazer operações de multiplicação.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicação
 */
public class Multiplication extends Calculus{
	private float num;
	private double result;
	
	/**
	 * Método construtor de Multiplication, que apenas inicializa ambos os atributos.
	 * @author Max Lucio
	 * @param num float - Números para executar a multiplicação, aqui inicializado com 0
	 * @param result double - Número que contêm o resultado da multiplicação, aqui inicializado com 0.0
	 */
	public Multiplication(float num, double result) {
		super(num, result);
	}

	/**
	 * Método que pega os números que o usuário definiu para a fazer a multiplicação e que chama o
	 * método operation para executar a multiplicação.
	 * @author Max Lucio
	 * @param num float - Números para executar a multiplicação
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Método que multiplicação todos os números definidos pelo usuário.
	 * @author Max Lucio
	 */
	@Override
	public void operation() {
		if(result == 0.0) {
			result = num;
		}else {
			result *= num;
		}
	}

	/**
	 * Método que retorna o valor da multiplicação efetuada.
	 * @author Max Lucio
	 * @return double - Valor da multiplicação efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
