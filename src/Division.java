package calculus;

/**
 * Subclasse de Calculus que e responsável por fazer operacoes de divisao.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicacao
 */
public class Division extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Metodo construtor de Division, que apenas inicializa ambos os atributos.
	 * @param num float - Numeros para executar a divisao, aqui inicializado com 0
	 * @param result double - Número que contém o resultado da divisao, aqui inicializado com 0.0
	 */
	public Division(float num, double result) {
		super(num, result);
	}

	/**
	 * Metodo que pega os numeros que o usuario definiu para a fazer a divisao e que chama o
	 * metodo operation para executar a divisao.
	 * @param num float - Numeros para executar a divisao
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Metodo que divide todos os numeros definidos pelo usuario.
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
	 * Metodo que retorna o valor da divisao efetuada.
	 * @return double - Valor da divisao efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
