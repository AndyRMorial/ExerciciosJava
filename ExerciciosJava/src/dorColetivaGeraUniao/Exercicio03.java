//Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo. Use break para interromper o loop interno quando o número 3 for atingido. 

package dorColetivaGeraUniao;

public class Exercicio03 { //loop aninhado
	public static void main(String[]args) {
		for (int numex = 1; numex <= 5; numex++) { //loop externo
			System.out.println(numex+"° vez");
			for (int numin = 1; numin <= 5; numin++) { //loop interno
				System.out.println(numin);
				if (numin == 3) {
					break;
				}	
			}
		}
	}
}