package exercicio_condicional_3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		int valor1;
		int valor2;
		int valor3;
		
		System.out.println("digite um valor para cada lado de um triângulo");
		
		System.out.println();
		System.out.println("Digite o Primeiro valor: ");
		valor1 = leitor.nextInt();
		System.out.println("Digite o Segundo valor: ");
		valor2 = leitor.nextInt();
		System.out.println("Digite o Terceiro valor: ");
		valor3 = leitor.nextInt();
		
		System.out.println();
		
		if (valor1 == valor2 && valor1 == valor3 ) 
			System.out.println("o triângulo é equilátero "); 
			
		else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3 )
			System.out.println("o triângulo é isósceles ");
		
		else if (valor1 != valor2 && valor2 != valor3 )
			System.out.println("o triângulo é escaleno");
			
		}
		
		
		
	}


