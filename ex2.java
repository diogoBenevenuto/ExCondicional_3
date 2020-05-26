package exercicio_condicional_3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite a idade do nadador: ");
		idade = leitor.nextInt();
		
		if (idade >= 5 && idade <= 10 ) {
		System.out.println("Categoria infantil");
		}
		
		else if ( idade >= 11 && idade <= 17 ) {
			System.out.println("Categoria juvenil");
		}
		  
		else if ( idade >= 18 ) {
			System.out.println("Categoria Adulto ");
		}
		
		
	}

}
