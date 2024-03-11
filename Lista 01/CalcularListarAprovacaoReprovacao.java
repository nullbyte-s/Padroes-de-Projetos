import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int[] notas;
    private double media;

    public Aluno(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
        this.media = calcularMedia();
    }

    private double calcularMedia() {
        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }
}

public class CalcularListarAprovacaoReprovacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        double somaMedias = 0;

        String nome;
        do {
            System.out.print("Digite o nome do aluno (ou 'sair' para encerrar): ");
            nome = entrada.nextLine();

            if (!nome.equalsIgnoreCase("sair")) {
                int[] notas = new int[3];
                for (int i = 0; i < 3; i++) {
                    System.out.print("Digite a nota " + (i + 1) + ": ");
                    notas[i] = entrada.nextInt();
                }
                entrada.nextLine();

                Aluno aluno = new Aluno(nome, notas);
                alunos.add(aluno);
                somaMedias += aluno.getMedia();
            }
        } while (!nome.equalsIgnoreCase("sair"));

        int aprovados = 0, reprovados = 0;
        System.out.println("\nNotas e médias dos alunos:");
        for (Aluno aluno : alunos) {
            System.out.printf("%s: %.1f\n", aluno.getNome(), aluno.getMedia());
            if (aluno.getMedia() >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double mediaGeral = somaMedias / alunos.size();
        System.out.printf("\nMédia geral da turma: %.1f\n", mediaGeral);
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);

        System.out.println("\nAprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() >= 6) {
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("\nReprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() < 6) {
                System.out.println(aluno.getNome());
            }
        }
    }
}