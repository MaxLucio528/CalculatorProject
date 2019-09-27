package calculus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe respons�vel pela execu��o do programa, contendo o m�todo que faz isso.
 * @author Max Lucio
 * @version 1.0
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
		int qtdNum;
		Scanner input = new Scanner(System.in);
		MainMenu menu = new MainMenu();
		
		do {
			menu.generateMenu();
			
			op = input.nextInt();
			
			if(op == 0) {
				System.out.println("\nPrograma finalizado...\n");
				break;
			}
			
			do {
				System.out.print("\nDigite quantos n�meros voc� ir� usar no c�lculo: ");
				qtdNum = input.nextInt();
				
				if(qtdNum < 2)
					System.out.println("\nVoc� precisa de pelo menos dois n�meros para fazer um c�lculo!");
				
			}while(qtdNum < 2);
			
			float num[] = new float[qtdNum];
			
			for(int i = 0; i < qtdNum; i++) {
				System.out.print("Digite o n�mero " + (i+1) + ": ");
				num[i] = input.nextFloat();
			}
			
			switch(op) {
				case 1:
					Sum sum = new Sum(null, 0.0);
					
					sum.getNumbers(num);
					sum.operation();
					
					System.out.println("\nO resultado da soma �: " + ((int) sum.showResult()) + "\n");
				break;
				case 2:
					Subtraction sub = new Subtraction(null, 0.0);
					
					sub.getNumbers(num);
					sub.operation();
					
					System.out.println("\nO resultado da subtra��o �: " + ((int) sub.showResult()) + "\n");
				break;
				case 3:
					Multiplication mult = new Multiplication(null, 0.0);
					
					mult.getNumbers(num);
					mult.operation();
					
					System.out.println("\nO resultado da multiplica��o �: " + ((int) mult.showResult()) + "\n");
				break;
				case 4:
					Division div = new Division(null, 0.0);
					
					div.getNumbers(num);
					div.operation();
					
					System.out.println("\nO resultado da divis�o �: " + div.showResult() + "\n");
				break;
				default:
					System.out.println("\nOp��o Inv�lida! Tente novamente...\n");
			}
		}while(op != 0);
		
		input.close();
	}
}
