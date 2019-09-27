package calculus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsável pela execução do programa, contendo o método que faz isso.
 * @author Max Lucio
 * @version 1.0
 * @since Release 01 da aplicação
 */
public class ProgramExecution {

	/**
	 * Método que executa todos os processos do programa recebendo os números com que
	 * o usuário irá fazer um cálculo e redirecionando para as classes que executam 
	 * as operações matemáticas.
	 * @author Max Lucio
	 * @throws InputMismatchException - Exceção jogada caso o usuário digite qualquer
	 * coisa que não seja um número.
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
				System.out.print("\nDigite quantos números você irá usar no cálculo: ");
				qtdNum = input.nextInt();
				
				if(qtdNum < 2)
					System.out.println("\nVocê precisa de pelo menos dois números para fazer um cálculo!");
				
			}while(qtdNum < 2);
			
			float num[] = new float[qtdNum];
			
			for(int i = 0; i < qtdNum; i++) {
				System.out.print("Digite o número " + (i+1) + ": ");
				num[i] = input.nextFloat();
			}
			
			switch(op) {
				case 1:
					Sum sum = new Sum(null, 0.0);
					
					sum.getNumbers(num);
					sum.operation();
					
					System.out.println("\nO resultado da soma é: " + ((int) sum.showResult()) + "\n");
				break;
				case 2:
					Subtraction sub = new Subtraction(null, 0.0);
					
					sub.getNumbers(num);
					sub.operation();
					
					System.out.println("\nO resultado da subtração é: " + ((int) sub.showResult()) + "\n");
				break;
				case 3:
					Multiplication mult = new Multiplication(null, 0.0);
					
					mult.getNumbers(num);
					mult.operation();
					
					System.out.println("\nO resultado da multiplicação é: " + ((int) mult.showResult()) + "\n");
				break;
				case 4:
					Division div = new Division(null, 0.0);
					
					div.getNumbers(num);
					div.operation();
					
					System.out.println("\nO resultado da divisão é: " + div.showResult() + "\n");
				break;
				default:
					System.out.println("\nOpção Inválida! Tente novamente...\n");
			}
		}while(op != 0);
		
		input.close();
	}
}
