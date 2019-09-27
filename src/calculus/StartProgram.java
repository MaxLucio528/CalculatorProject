package calculus;

import java.util.InputMismatchException;

/**
 * Classe que cuida da inicializa��o do programa, redirecionando para outra classe
 * que executa os processos de execu��o.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplica��o
 */
public class StartProgram {
	
	/**
	 * M�todo main, respons�vel pela inicializa��o do programa e que trata eventuais
	 * exce��es que podem vir a ocorrer.
	 * @author Max Lucio
	 * @param args String[] - Par�metro padr�o da main no Java.
	 */
	public static void main(String[] args) {
		try {
			ProgramExecution program = new ProgramExecution();
			program.process();
		}
		catch(InputMismatchException e) {
			System.out.println("\nErro! Voc� precisa digitar um n�mero! " + e.toString() + "\n");
			StartProgram.main(args);
		}
		catch(Exception e) {
			System.out.println("\nErro! Algo deu errado por conta de " + e.toString());
			StartProgram.main(args);
		}
	}

}
