import java.util.Scanner;

public class IniciaisNome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine();
        sc.close();

        String iniciais = "";

        String[] partes = nome.split(" ");

        for (String parte : partes) {
            if (!parte.isEmpty()) {
                char c = parte.charAt(0);
                if (Character.isUpperCase(c)) {
                    iniciais += c + ".";
                }
            }
        }

        iniciais = iniciais.substring(0, iniciais.length() - 1);

        System.out.print("\nAs iniciais do nome inserido são: " + iniciais);
    }
}