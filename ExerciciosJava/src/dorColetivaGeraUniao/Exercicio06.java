//Imprima os n�meros de 1 a 10, pulando a impress�o do n�mero 5, usando continue.

package dorColetivaGeraUniao;

public class Exercicio06 {
	public static void main (String[] args) {
		for (int num = 1; num <= 10; num++) {
			if (num == 5) {
				continue;
			}
			System.out.println(num);
		}
	}
}
