package calculus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsavel pela execucao do programa, contendo o metodo que faz isso.
 * @author Max Lucio
 * @version 1.1.1
 * @since Release 01 da aplicacao
 */
public class ProgramExecution {

	/**
	 * Metodo que executa todos os processos do programa recebendo os nameros com que
	 * o usuario ira fazer um calculo e redirecionando para as classes que executam 
	 * as operacoes matematicas.
	 * @throws InputMismatchException - Excecao jogada caso o usuario digite qualquer
	 * coisa que nao seja um namero.
	 */
	public void process() throws InputMismatchException {
		int op;
		double result;
		String num;
		String exp;
		Scanner input = new Scanner(System.in);
		MainMenu menu = new MainMenu();
		ArrayList<Calculus> calculus = new ArrayList<Calculus>();
		calculus.add(new Sum(0, 0.0));
		calculus.add(new Subtraction(0, 0.0));
		calculus.add(new Multiplication(0, 0.0));
		calculus.add(new Division(0, 0.0));
		calculus.add(new Power(0, 0, 0.0));
		
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
					System.out.println("\nDigite os numeros que ira somar (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(0).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					
					result = calculus.get(0).showResult();
					
					System.out.println("\nO resultado da soma e: " + result + "\n");
				break;
				case 2:
					System.out.println("\nDigite os numeros que ira subtrair (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(1).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(1).showResult();
					
					System.out.println("\nO resultado da subtracao e: " + result + "\n");
				break;
				case 3:
					System.out.println("\nDigite os numeros que ira multiplicar (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(2).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(2).showResult();
					
					System.out.println("\nO resultado da multiplicacao e: " + result + "\n");
				break;
				case 4:
					System.out.println("\nDigite os numeros que ira dividir (Digite '=' para obter o resultado): ");
					
					do {
						num = input.nextLine();
						
						if(num.equals("=")) {
							break;
						}else {
							calculus.get(3).getNumbers(Float.parseFloat(num));
						}
					}while(num != "=");
					

					result = calculus.get(3).showResult();
					
					System.out.println("\nO resultado da divisao e: " + result + "\n");
				break;
				case 5:
					System.out.println("\nDigite a base para calcular a potencia: ");
					
					num = input.nextLine();
						
					System.out.println("\nDigite o expoente para calcular a potencia: ");
						
					exp = input.nextLine();
						
					calculus.get(4).getNumbers(Float.parseFloat(num));
					((Power) calculus.get(4)).getExponent(Float.parseFloat(exp));
					
					result = calculus.get(4).showResult();
					
					System.out.println("\nO resultado da potenciacao e: " + result + "\n");
				break;
				default:
					System.out.println("\nOpcao Invalida! Tente novamente...\n");
			}
		}while(op != 0);
		
		input.close();
	}
}
