//Crie um loop infinito que solicita ao usu�rio um n�mero. Pare o loop quando o n�mero 0 for inserido.

package dorColetivaGeraUniao;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while (num != 0) {
			
			System.out.println("Digite um valor inteiro: ");
			
			num = sc.nextInt();
		}
		
		System.out.println("Encerrado!");
		
		sc.close();	
		
	}
}
