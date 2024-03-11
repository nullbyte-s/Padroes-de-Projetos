import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArrayLetras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra;
        do {
            System.out.print("Escreva uma palavra: ");
            palavra = entrada.nextLine().toLowerCase();
            palavra = removerAcentos(palavra);
        } while (!validarPalavra(palavra));

        entrada.close();

        int[] valores = new int[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            valores[i] = palavra.charAt(i) - 'a' + 1;
        }

        System.out.println("Array: " + Arrays.toString(valores));

        Arrays.sort(valores);
        System.out.println("Array ordenado: " + Arrays.toString(valores));

        StringBuilder palavraOrdenada = new StringBuilder();
        for (int valor : valores) {
            palavraOrdenada.append((char) (valor + 'a' - 1));
        }

        System.out.println("Saída: " + palavraOrdenada);
    }

    public static String removerAcentos(String palavra) {
        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD);
        palavra = palavra.replaceAll("[^\\p{ASCII}]", "");
        return palavra;
    }

    public static boolean validarPalavra(String palavra) {
        return palavra.matches("[a-zA-Z]+");
    }
}