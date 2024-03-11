import java.util.Scanner;

public class InverterMensagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma mensagem: ");
        String mensagem = entrada.nextLine();

        String mensagemInvertida = "";
        for (int i = mensagem.length() - 1; i >= 0; i--) {
            mensagemInvertida += mensagem.charAt(i);
        }

        System.out.println("Mensagem: " + mensagem);
        System.out.println("Mensagem invertida: " + mensagemInvertida);
    }
}