package condicionais;

import java.util.Scanner;

public class PrimeirosPassos {
	Scanner sc = new Scanner(System.in);
/*	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("o Numero " + numero + " é par");	
		}else {
			System.out.println("o Numero " + numero + " é impar");
		}
		
//tem o next (pegar o proximo espaço vazio e o line, que é a proxima linha)
//existe um tipo de next para cada 
		sc.close();
		*/

	//FUPQ De ao usuario formas de pagamento, com as seguintes 
	//1 a vista 10%
	//2 debito tem juros de 15%
	//3 cartão de debito não tem desconto
	/*		
	public static void main(String [] anrgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor a ser pago: ");
		float debito = sc.nextFloat();
		System.out.println("Escolha uma forma de pagamento \\n 1- a vista \\n 2- Debito \\n 3- Credito");
		int opcao = sc.nextInt();

		switch(opcao) {
			case 1:
				float valorApagar = debito - ((debito / 100) * 10 );
				System.out.println("voce ganhou 10% de desconto, o novo valor é  " +valorApagar);	
			case 2 :
				float valorApagar2 = debito + ((debito / 100) * 15 );
				System.out.println("voce vai precisar pagar 15% de juros, o novo valor é "+ valorApagar2);
			case 3 :
			System.out.println("sem desconto");
		}*/
	//switch expression
	
		
		System.out.println("Escolha uma forma de pagamento \\n 1- a vista \\n 2- Debito \\n 3- Credito");
		int opcao = sc.nextInt();
		int opcaocomexpression = switch(opcao) {
			case 1 -> 4;
			case 2 -> 5;
			case 3 -> 6;
			case 4 -> 7;
		};
		
		System.out.println(opcao);
		
		sc.close();

	
	byte idade = 15;
	boolean permitido = idade >=18;
	

	String resultado = idade>= 18 ? "permitido":"nao permitido";
	
	System.out.println(resultado);
}
}