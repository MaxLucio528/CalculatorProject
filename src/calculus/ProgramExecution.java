package calculus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsável pela execução do programa, contendo o método que faz isso.
 * @author Max Lucio
 * @version 1.1
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
					System.out.println("\nDigite os números que irá somar (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(0).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					
					result = calculus.get(0).showResult();
					
					System.out.println("\nO resultado da soma é: " + result + "\n");
				break;
				case 2:
					System.out.println("\nDigite os números que irá subtrair (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(1).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(1).showResult();
					
					System.out.println("\nO resultado da subtração é: " + result + "\n");
				break;
				case 3:
					System.out.println("\nDigite os números que irá multiplicar (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(2).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(2).showResult();
					
					System.out.println("\nO resultado da multiplicação é: " + result + "\n");
				break;
				case 4:
					System.out.println("\nDigite os números que irá dividir (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(3).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(3).showResult();
					
					System.out.println("\nO resultado da divisão é: " + result + "\n");
				break;
				default:
					System.out.println("\nOpção Inválida! Tente novamente...\n");
			}
		}while(op != 0);
		
		input.close();
	}
}
