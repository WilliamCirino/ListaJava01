package exercicios;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base do retângulo: ");

		float base = sc.nextFloat();

		System.out.println("Digite o valor da altura do retângulo: ");

		float altura = sc.nextFloat();

		float area = base * altura;

		System.out.println("A área do Retângulo é: " + area);
		sc.close();

	}

}
