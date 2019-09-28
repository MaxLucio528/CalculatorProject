package calculus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe respons�vel pela execu��o do programa, contendo o m�todo que faz isso.
 * @author Max Lucio
 * @version 1.1
 * @since Release 01 da aplica��o
 */
public class ProgramExecution {

	/**
	 * M�todo que executa todos os processos do programa recebendo os n�meros com que
	 * o usu�rio ir� fazer um c�lculo e redirecionando para as classes que executam 
	 * as opera��es matem�ticas.
	 * @author Max Lucio
	 * @throws InputMismatchException - Exce��o jogada caso o usu�rio digite qualquer
	 * coisa que n�o seja um n�mero.
	 */
	public void process() throws InputMismatchException {
		int op;
		double result;
		String num;
		Scanner input = new Scanner(System.in);
		MainMenu menu = new MainMenu();
		ArrayList<Calculus> calculus = new ArrayList<Calculus>();
		calculus.add(new Sum(0, 0.0));
		calculus.add(new Subtraction(0, 0.0));
		calculus.add(new Multiplication(0, 0.0));
		calculus.add(new Division(0, 0.0));
		
		do {
			menu.generateMenu();
			
			op = input.nextInt();
			input.nextLine();
			
			if(op == 0) {
				System.out.println("\nPrograma finalizado...\n");
				break;
			}
			
			switch(op) {
				case 1:
					System.out.println("\nDigite os n�meros que ir� somar (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(0).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					
					result = calculus.get(0).showResult();
					
					System.out.println("\nO resultado da soma �: " + result + "\n");
				break;
				case 2:
					System.out.println("\nDigite os n�meros que ir� subtrair (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(1).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(1).showResult();
					
					System.out.println("\nO resultado da subtra��o �: " + result + "\n");
				break;
				case 3:
					System.out.println("\nDigite os n�meros que ir� multiplicar (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(2).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(2).showResult();
					
					System.out.println("\nO resultado da multiplica��o �: " + result + "\n");
				break;
				case 4:
					System.out.println("\nDigite os n�meros que ir� dividir (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(3).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(3).showResult();
					
					System.out.println("\nO resultado da divis�o �: " + result + "\n");
				break;
				default:
					System.out.println("\nOp��o Inv�lida! Tente novamente...\n");
			}
		}while(op != 0);
		
		input.close();
	}
}
