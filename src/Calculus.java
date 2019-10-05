package calculus;

/**
 * Classe abstrata que generaliza uma operacao de calculo
 * @author Max Lucio
 * @version 1.1.1
 * @since Release 01 da aplicação
 */
public abstract class Calculus {
	private float num;
	private double result;
	
	/**
	 * Construtor da classe abstrata, que e chamado pelas subclasses
	 * deste programa.
	 * @param num float - Numeros que irao executar algum calculo em subclasses
	 * @param result double - Resultado de algum calculo efetuado em subclasses
	 */
	public Calculus(float num, double result) {
		this.num = num;
		this.result = result;
	}
	
	/**
	 * Metodo abstrato que em subclasses ira pegar os Numeros para efetuar
	 * alguma operacao matematica.
	 * @param num float - Numeros que irao ser usados em operacoes feitas em subclasses,
	 * jogando os valores em result posteriormente.
	 */
	public abstract void getNumbers(float num);
	/**
	 * Metodo abstrato que em subclasses, ira executar a operacao de algum calculo.
	 */
	public abstract void operation();
	/**
	 * Metodo abstrato que em subclasses, ira mostrar o resultado de uma operacao
	 * matematica.
	 * @return double - Resultado da operacao matematica solicitada pelo usuário
	 */
	public abstract double showResult();
}
