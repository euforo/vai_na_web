package condicionais;

import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o candidato");
        System.out.print("1- Joaquin"
        		+ "\n 2- Jovem nerd"
        		+ "\n 3- TESTE");
        
        int opcao = scanner.nextInt();
        int resultado = switch (opcao) {
            case '1' -> resultado = opcao;
            case '2' -> resultado = opcao;
            case '3' -> resultado = opcao;
            default -> 0;


            
        };

        System.out.println("Resultado: " + resultado);
    }
}
