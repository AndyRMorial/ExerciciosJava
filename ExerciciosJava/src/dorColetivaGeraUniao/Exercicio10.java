//Dado um array de n�meros inteiros, imprima cada n�mero at� encontrar um n�mero negativo. Use break para interromper o loop nesse ponto. 

package dorColetivaGeraUniao;

public class Exercicio10 {
	public static void main(String[]args) {
		int [] numeros = {57, 0, 184, -8, -888, 624};
		
		for (int num : numeros) {
            if (num < 0) {
                break;
            }
            System.out.println(num);
        }
    }
}