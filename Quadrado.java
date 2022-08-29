package exercicios;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Lado do quadrado: ");
		
		int lado1 = sc.nextInt();
		
		int area = lado1*lado1;
		
		System.out.println("A área do quadrado é: " + area);
		
		sc.close();

	}

}
