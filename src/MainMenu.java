package calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Classe que contem um metodo que gera o menu no terminal automaticamente.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicacao
 */
public class MainMenu {
	private final String title;
	private final ArrayList<String> options;
	
	/**
	 * Construtor da classe, onde sao definidos o titulo do menu e as opcoes
	 * do menu em um ArrayList.
	 */
	public MainMenu() {
		title = "Calculadora MX";
		options = new ArrayList<String>();
		options.addAll(Arrays.asList("1 - Soma", "2 - Subtracao", "3 - Multiplicacao", "4 - Divisao",
				"5 - Potenciacao", "0 - Sair"));
	}
	
	/**
	 * Metodo que gera o menu, puxando as informacoes da String e do ArrayList
	 * para poder gerar o menu do programa, utiliza-se um Iterator para percorrer
	 * o ArrayList em um laco for.
	 */
	public void generateMenu() {
		Iterator<String> percorre = options.iterator();
		
		System.out.println(title + "\n");

		while(percorre.hasNext()) { 
			System.out.println(percorre.next());
		}
		
		System.out.println();
		System.out.print("Escolha uma opcao: ");
	}
}
