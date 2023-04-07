package Verificador;

import java.util.Scanner;

public class verificadorjava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		
		
		if (sobrenome.equalsIgnoreCase("wayne")){
			System.out.println("Acesso liberado, Sr.Wayne");
		} else if(sobrenome.equalsIgnoreCase("kent")){
			System.out.println("sai dai mané!!");
		} else if (nome.equalsIgnoreCase("Diana")){
			System.out.println("Bem-vinda, Princesa de Themyscara!");
		} else{
			System.out.println("!!!Cai Fora!!!");
		}
		sc.close();
	}
		
}
