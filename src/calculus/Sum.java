package calculus;

/**
 * Subclasse de Calculus que e responsavel por fazer operacoes de adicao.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicacao
 */
public class Sum extends Calculus {
	private float num;
	private double result;
	
	/**
	 * Metodo construtor de Sum, que apenas inicializa ambos os atributos.
	 * @param num float - Numeros para executar a soma, aqui inicializado com 0
	 * @param result double - Numero que contem o resultado da soma, aqui inicializado com 0.0
	 */
	public Sum(float num, double result) {
		super(num, result);
	}
	
	/**
	 * Metodo que pega os numeros que o usuario definiu para a fazer a soma e que chama o
	 * metodo operation para executar a soma.
	 * @param num float - Numeros para executar a soma
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Metodo que soma todos os numeros definidos pelo usuario.
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
	 * Metodo que retorna o valor da soma efetuada.
	 * @return double - Valor da soma efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}
}
