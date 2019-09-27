package calculus;

import java.util.InputMismatchException;

/**
 * Classe que cuida da inicialização do programa, redirecionando para outra classe
 * que executa os processos de execução.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class StartProgram {
	
	/**
	 * Método main, responsável pela inicialização do programa e que trata eventuais
	 * exceções que podem vir a ocorrer.
	 * @author Max Lucio
	 * @param args String[] - Parâmetro padrão da main no Java.
	 */
	public static void main(String[] args) {
		try {
			ProgramExecution program = new ProgramExecution();
			program.process();
		}
		catch(InputMismatchException e) {
			System.out.println("\nErro! Você precisa digitar um número! " + e.toString() + "\n");
			StartProgram.main(args);
		}
		catch(Exception e) {
			System.out.println("\nErro! Algo deu errado por conta de " + e.toString());
			StartProgram.main(args);
		}
	}

}
