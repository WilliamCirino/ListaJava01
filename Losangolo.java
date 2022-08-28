package exercicios;

import java.util.Scanner;

public class Losangolo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da Diagonal Maior: ");

		float maior = sc.nextFloat();

		System.out.println("Digite o valor da Diagonal Menor: ");

		float menor = sc.nextFloat();

		float area = maior * menor / 2;
		
		System.out.println("A área do Losangulo é: " + area);
		
		sc.close();

	}

}
