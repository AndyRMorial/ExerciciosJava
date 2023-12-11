//Imprima os números de 1 a 10, pulando a impressão do número 5 e interrompendo o loop quando encontrar o número 8. 

package dorColetivaGeraUniao;

public class Exercicio08 {
	public static void main(String[]args) {
		for (int num = 1; num <= 10; num++) {
			if (num == 5) {
				continue;
			}
			if (num == 8) {
				break;
			}
			System.out.println(num);
		}
	}
}
