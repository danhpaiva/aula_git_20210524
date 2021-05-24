package teste;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		int numero_um = 0, numero_dois = 0, total = 0;
		
		System.out.println("Informe o primeiro número: ");
		numero_um = sc1.nextInt();
		
		System.out.println("Informe o segundo número: ");
		numero_dois = sc1.nextInt();
		
		total = numero_um + numero_dois;
		
		System.out.println("Valor da soma: " + total);
	}

}
