package calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Classe que contém um método que gera o menu no terminal automaticamente.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class MainMenu {
	private final String title;
	private final ArrayList<String> options;
	
	/**
	 * Construtor da classe, onde são definidos o título do menu e as opções
	 * do menu em um ArrayList.
	 * @author Max Lucio
	 */
	public MainMenu() {
		title = "Calculadora MX";
		options = new ArrayList<String>();
		options.addAll(Arrays.asList("1 - Soma", "2 - Subtração", "3 - Multiplicação", "4 - Divisão", "0 - Sair"));
	}
	
	/**
	 * Método que gera o menu, puxando as informações da String e do ArrayList
	 * para poder gerar o menu do programa, utiliza-se um Iterator para percorrer
	 * o ArrayList em um laço for.
	 * @author Max Lucio
	 */
	public void generateMenu() {
		Iterator<String> percorre = options.iterator();
		
		System.out.println(title + "\n");

		while(percorre.hasNext()) { 
			System.out.println(percorre.next());
		}
		
		System.out.println();
		System.out.print("Escolha uma opção: ");
	}
}
