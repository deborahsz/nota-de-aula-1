import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o tamanho/peso do produto: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Informe a cor do produto: ");
        String cor = scanner.nextLine();
        System.out.print("Informe o valor do produto: R$");
        double valor = scanner.nextDouble();
        System.out.print("Informe a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        Produto produto1 = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);
        produto1.cadastrar();

        System.out.print("Informe a quantidade a ser vendida: ");
        int quantidadeVenda = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o método de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
        String metodoPagamento = scanner.nextLine();

        Venda venda1 = new Venda(produto1, quantidadeVenda, metodoPagamento);
        venda1.realizarVenda();
    }
}
