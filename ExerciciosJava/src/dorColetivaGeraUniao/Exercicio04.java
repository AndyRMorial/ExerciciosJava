//Crie um loop aninhado que imprima os n�meros de 1 a 5 para cada itera��o do loop externo, pulando a impress�o do n�mero 3 em cada itera��o interna usando continue.

package dorColetivaGeraUniao;

public class Exercicio04 {//loop aninhado
	public static void main(String[]args) {
		for (int numex = 1; numex <= 5; numex++) { //loop externo
			System.out.println(numex+"� vez");
			for (int numin = 1; numin <= 5; numin++) { //loop interno
				if (numin == 3) {
					continue;
				}
				System.out.println(numin);
			}
		}
	}
}