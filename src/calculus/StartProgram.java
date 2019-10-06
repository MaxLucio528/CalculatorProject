package calculus;

import java.util.InputMismatchException;

/**
 * Classe que cuida da inicializacao do programa, redirecionando para outra classe
 * que executa os processos de execucao.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplicacao
 */
public class StartProgram {
	
	/**
	 * Metodo main, responsavel pela inicializacao do programa e que trata eventuais
	 * excecoes que podem vir a ocorrer.
	 * @param args String[] - Parametro padrao da main no Java.
	 */
	public static void main(String[] args) {
		try {
			ProgramExecution program = new ProgramExecution();
			program.process();
		}
		catch(InputMismatchException e) {
			System.out.println("\nErro! Voce precisa digitar um numero! " + e.toString() + "\n");
			StartProgram.main(args);
		}
		catch(Exception e) {
			System.out.println("\nErro! Algo deu errado por conta de " + e.toString() + "\n");
			StartProgram.main(args);
		}
	}

}
