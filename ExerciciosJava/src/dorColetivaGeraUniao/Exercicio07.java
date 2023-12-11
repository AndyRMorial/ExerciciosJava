// Use um loop para iterar sobre os números de 1 a 5. Pare o loop quando encontrar o número 3. Use switch para imprimir uma mensagem diferente para cada número.

package dorColetivaGeraUniao;

public class Exercicio07 {
	public static void main(String[]args) {
		for (int num = 1; num <= 5; num++) {
			System.out.println(num + "° Sequência");
			switch (num) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
			case 4:
				System.out.println("4");
			case 5:
				System.out.println("5");
			}
			if (num == 3) {
				break;
			}
		}
	}
}
