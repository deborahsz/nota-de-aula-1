import java.util.Scanner;

public class Venda {
    private Produto produto;
    private int quantidade;
    private String metodoPagamento;

    public Venda(Produto produto, int quantidade, String metodoPagamento) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarVenda() {
        if (quantidade > produto.getQuantidadeEstoque()) {
            System.out.println("Quantidade em estoque insuficiente.");
            return;
        }

        double total = produto.getValor() * quantidade;

        if (metodoPagamento.equals("Pix") || metodoPagamento.equals("Espécie") ||
                metodoPagamento.equals("Transferência") || metodoPagamento.equals("Débito")) {
            total *= 0.95;
        }

        System.out.printf("Valor total da venda: R$%.2f\n", total);

        if (metodoPagamento.equals("Espécie")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o valor pago: R$");
            double pagamento = scanner.nextDouble();
            if (pagamento > total) {
                double troco = pagamento - total;
                System.out.printf("Troco: R$%.2f\n", troco);
            } else if (pagamento < total) {
                System.out.println("Valor insuficiente para a compra.");
            }
        }

        produto.atualizarEstoque(quantidade);
    }
}

