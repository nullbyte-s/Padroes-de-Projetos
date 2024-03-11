import java.util.Random;
import java.util.Scanner;

public class ZeroAMil {
    public static void main(String[] args){
        Random random = new Random();
        int numeroSorteado = random.nextInt(1001);
        int contadorPalpites = 1;

        Scanner scanner = new Scanner(System.in);
        int valorUsuario;

        do {
            System.out.print("Insira um número inteiro entre 0 e 1000: ");
            valorUsuario = scanner.nextInt();
            String comparacao = (numeroSorteado == valorUsuario) ? "igual ao" :
                    (numeroSorteado > valorUsuario) ? "maior que" : "menor que";
            System.out.println("O número sorteado é " + comparacao + " número informado!\n");
            contadorPalpites++;
        } while (valorUsuario != numeroSorteado);
        System.out.println("Número de palpites: " + contadorPalpites);
        scanner.close();
    }
}