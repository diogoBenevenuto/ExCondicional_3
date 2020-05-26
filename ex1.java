package exercicio_condicional_3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner leitor = new Scanner (System.in);
		 
			 
			
			System.out.println("Digite um nuemro entre 20 e 90 : ");
			numero = leitor.nextInt();
			
			if (numero > 20 && numero < 90 ) {
				System.out.printf(" o numero %d ,está copreendido" ,numero );
			}
		
		
		
		
	}

}
