import java.util.Scanner;

public class Produto {
    private int codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void cadastrar() {
        System.out.println("Produto cadastrado: " + nome + " - Código: " + codigo);
    }

    public void atualizarEstoque(int vendaQuantidade) {
        quantidadeEstoque -= vendaQuantidade;
        System.out.println("Estoque atualizado: " + quantidadeEstoque + " unidades restantes.");
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
