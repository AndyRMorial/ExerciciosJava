//Imprima os n�meros �mpares de 1 a 10, usando continue para pular os n�meros pares. 

package dorColetivaGeraUniao;

public class Exercicio02 {
	public static void main(String[]args) {
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
