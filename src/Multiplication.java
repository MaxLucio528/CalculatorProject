package calculus;

/**
 * Subclasse de Calculus que e responsável por fazer operacoes de multiplicacao.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicaçao
 */
public class Multiplication extends Calculus{
	private float num;
	private double result;
	
	/**
	 * Metodo construtor de Multiplication, que apenas inicializa ambos os atributos.
	 * @param num float - Numeros para executar a multiplicacao, aqui inicializado com 0
	 * @param result double - Numero que contém o resultado da multiplicacao, aqui inicializado com 0.0
	 */
	public Multiplication(float num, double result) {
		super(num, result);
	}

	/**
	 * Metodo que pega os numeros que o usuario definiu para a fazer a multiplicacao e que chama o
	 * metodo operation para executar a multiplicacao.
	 * @param num float - Numeros para executar a multiplicacao
	 */
	@Override
	public void getNumbers(float num) {
		this.num = num;
		operation();
	}

	/**
	 * Metodo que multiplicacao todos os numeros definidos pelo usuario.
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
	 * Metodo que retorna o valor da multiplicacao efetuada.
	 * @return double - Valor da multiplicacao efetuada
	 */
	@Override
	public double showResult() {
		return result;
	}

}
