package calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Classe que cont�m um m�todo que gera o menu no terminal automaticamente.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public class MainMenu {
	private final String title;
	private final ArrayList<String> options;
	
	/**
	 * Construtor da classe, onde s�o definidos o t�tulo do menu e as op��es
	 * do menu em um ArrayList.
	 * @author Max Lucio
	 */
	public MainMenu() {
		title = "Calculadora MX";
		options = new ArrayList<String>();
		options.addAll(Arrays.asList("1 - Soma", "2 - Subtra��o", "3 - Multiplica��o", "4 - Divis�o", "0 - Sair"));
	}
	
	/**
	 * M�todo que gera o menu, puxando as informa��es da String e do ArrayList
	 * para poder gerar o menu do programa, utiliza-se um Iterator para percorrer
	 * o ArrayList em um la�o for.
	 * @author Max Lucio
	 */
	public void generateMenu() {
		Iterator<String> percorre = options.iterator();
		
		System.out.println(title + "\n");

		while(percorre.hasNext()) { 
			System.out.println(percorre.next());
		}
		
		System.out.println();
		System.out.print("Escolha uma op��o: ");
	}
}
