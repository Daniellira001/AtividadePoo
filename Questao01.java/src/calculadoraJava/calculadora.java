package calculadoraJava;

import java.util.Locale;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("!!!Calculadora Java!!!");
		System.out.println("<- Escolha a Operaçaão que deseja Realizar ->");
		System.out.println("[1]-Soma; [2]-Subtração; [3]-Multiplicação; [4]-Divisão; [5]-Potenciação; [6]-Raiz Quadrada; [7]-Raiz Cúbica");
		int operador = sc.nextInt();
		
		double n1, n2, result;
		int cont = 1;
		while(cont != 0) {
			switch (operador) {
				case 1:
					System.out.println("Digite o Primeiro Númeoro:");
					n1 = sc.nextDouble();
					System.out.println("Digite o Segundo Númeoro:");
					n2 = sc.nextDouble();
					result = n1 + n2;
					System.out.println("O Resultado da Soma é: " + result );
					break;
				case 2:
					System.out.println("Digite o Primeiro Númeoro:");
					n1 = sc.nextDouble();
					System.out.println("Digite o Segundo Númeoro:");
					n2 = sc.nextDouble();
					result = n1 - n2;
					System.out.println("O Resultado da Subtração é: " + result );
					break;
				case 3: 
					System.out.println("Digite o Primeiro Númeoro:");
					n1 = sc.nextDouble();
					System.out.println("Digite o Segundo Númeoro:");
					n2 = sc.nextDouble();
					result = n1 * n2;
					System.out.println("O Resultado da Multiplicação é: " + result );
					break;
				case 4:
					System.out.println("Digite o Primeiro Númeoro:");
					n1 = sc.nextDouble();
					System.out.println("Digite o Segundo Númeoro:");
					n2 = sc.nextDouble();
					if (n2 == 0) {
						System.out.println("Erro: impossível Efetuar Divisão por [0] :( ");
					}else {
					result = n1 / n2;
					System.out.println("O Resultado da Divisão é: " + result );
					}
					break;
				case 5:
					System.out.println("Digite o Número Base:");
					n1 = sc.nextDouble();
					System.out.println("Digite o Númeoro Expoente:");
					n2 = sc.nextDouble();
					result = Math.pow(n1, n2);
					System.out.println("O Resultado da Potenciação é: " + result );
					break;
				case 6: 
					System.out.println("Digite o Primeiro Númeoro:");
					n1 = sc.nextDouble();
					result = Math.sqrt(n1);
					System.out.println("O Resultado da Raiz Quadrada é: " + result );
					break;
				case 7:
					System.out.println("Digite o Primeiro Númeoro:");
					n1 = sc.nextDouble();
					result = Math.cbrt(n1);
					System.out.println("O Resultado da Raiz Cúbica é: " + result );
					break;
			}
			break;
		}
		sc.close();
	}

}
