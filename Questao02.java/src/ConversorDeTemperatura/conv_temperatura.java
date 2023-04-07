package ConversorDeTemperatura;

import java.util.Scanner;

public class conv_temperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Temperatura: ");
		double temp = sc.nextDouble();
		System.out.println(" ->Escolha sua Escala<- ");
		System.out.println("[1]-Celsius; [2]-Fahrenheit; [3]-Kelvin");
		int escala = sc.nextInt();

		double celsius = temp;

		switch (escala) {
		case 1:
			System.out.printf("%.2f C\n", celsius);
			break;
		case 2:
			celsius = (temp - 32) * 5 / 9;
			break;
		case 3:
			celsius = temp - 237.15;
			break;
		default:
			System.out.println("!!!Escala errada!!!");
		}

		double fahrenheit = celsius * 9 / 5 + 32;

		double kelvin = celsius + 273.15;

		System.out.printf("%.2f C\n", celsius);
		System.out.printf("%.2f F\n", fahrenheit);
		System.out.printf("%.2f K\n", kelvin);

		sc.close();

	}

}
