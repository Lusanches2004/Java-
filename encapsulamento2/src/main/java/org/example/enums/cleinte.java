package org.example.enums;

public class cleinte {
    private String nome;
    private int idade;
    private  pedidos pedido;

    public cleinte(String nome, int idade, pedidos pedido) {
        this.nome = nome;
        this.idade = idade;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public pedidos getPedido() {
        return pedido;
    }

    public void setPedido(pedidos pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "cleinte{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pedido=" + pedido +
                '}';
    }
}
