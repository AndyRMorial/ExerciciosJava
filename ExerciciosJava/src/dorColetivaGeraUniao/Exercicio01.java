//Imprima os n�meros de 1 a 10, mas pare a execu��o do loop quando chegar a 5.

package dorColetivaGeraUniao;

public class Exercicio01 {
	public static void main(String[]args) {
		for (int num = 1; num <= 10; num++) {
			if (num == 6) {
				break;
			}
			System.out.println(num);
		}
	}
}