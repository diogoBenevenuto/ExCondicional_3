package exercicio_condicional_3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salario;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite seu salario: ");
		salario = leitor.nextInt();
		
		if (salario >= 0 && salario <= 1000 ) {
			System.out.println("recebeu aumento de 15%: " + (salario + (salario/100*15) ) );
		}
		
		else if (salario > 1001 && salario <= 2500 ) {
			System.out.println("recebeu aumento de 7%: " + (salario + (salario/100*7) ) );
		}
		
		else if (salario > 2500 ) {
			System.out.println("Não houve aumento: " + salario );
		}
		
		
	}

}
