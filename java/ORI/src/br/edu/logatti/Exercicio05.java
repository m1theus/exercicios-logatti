package br.edu.logatti;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		final int[] vetor = { 2, 4, 9, 1, 3, 7, 5, 6 };
		final Scanner scanner = new Scanner(System.in);
		
		System.out.println("informe um n�mero inteiro: ");
		final int numero = scanner.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if (numero == vetor[i]) {
				System.out.println(String.format("O n�mero %s est� na posi��o %s do vetor.", numero, i));
				break;
			}
			
			if ((vetor.length -1) == i) {
				System.out.println(String.format("O n�mero informado %s n�o se encontra no vetor.", numero));
			}
			
		}
		
		scanner.close();
		
	}

}
