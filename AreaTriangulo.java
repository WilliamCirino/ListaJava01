package exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base do Triangulo: ");

		float base = sc.nextFloat();

		System.out.println("Digite o valor da altura do Triangulo: ");

		float altura = sc.nextFloat();

		float area = base * altura / 2;

		System.out.println("A área do Triangulo é: " + area);
		sc.close();

	}

}
