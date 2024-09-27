import java.util.Scanner;

public class SituacaoAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();


        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String situacao;
        if (media >= 70) {
            situacao = "Aprovado";
        } else if (media < 40) {
            situacao = "Reprovado";
        } else {
            situacao = "Na final";
        }


        System.out.printf("O aluno %s tem média %.2f e está %s.%n", nome, media, situacao);


        scanner.close();
    }
}
