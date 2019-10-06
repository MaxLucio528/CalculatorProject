package calculus;

/**
 * Subclasse de Calculus que e responsavel por fazer operacoes de subtracao.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicacao
 */
public class Subtraction extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Metodo construtor de Subtraction, que apenas inicializa ambos os atributos.
	 * @param num float - Numeros para executar a subtracao, aqui inicializado com 0
	 * @param result double - Numero que contem o resultado da subtracao, aqui inicializado com 0.0
	 */
	public Subtraction(float num, double result) {
		super(num, result);
	}

	/**
	 * Metodo que pega os numeros que o usuario definiu para a fazer a subtracao e que chama o
	 * Metodo operation para executar a subtracao.
	 * @param num float - Numeros para executar a subtracao
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Metodo que subtrai todos os numeros definidos pelo usuario.
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
	 * Metodo que retorna o valor da subtracao efetuada.
	 * @return double - Valor da subtracao efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
