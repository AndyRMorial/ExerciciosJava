//Imprima os n�meros de 1 a 10, pulando a impress�o do n�mero 5 e interrompendo o loop quando encontrar o n�mero 8. 

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
