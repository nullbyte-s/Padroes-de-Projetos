import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número para verificar se é primo ou não: ");
        numero = scanner.nextInt();

        System.out.print("\nO número " + numero);

        if (verificaNumeroPrimo(numero) == false) {
            System.out.print(" não");
        }
        System.out.println(" é um número primo");
    }

    public static boolean verificaNumeroPrimo(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}