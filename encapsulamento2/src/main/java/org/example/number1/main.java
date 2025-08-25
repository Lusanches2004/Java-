package org.example.number1;

public class main {
    public static void main(String[] args) {
        funcionario func = new funcionario("1", "João", "3000", "Vendas", "Masculino", "30");
        funcionario f1 = new funcionario("2", "Maria", "3500", "Marketing", "Feminino", "28");
        funcionario f2 = new funcionario("3", "Pedro", "4000", "Financeiro", "Masculino", "35");
        funcionario f3 = new funcionario("4", "Ana", "3200", "RecursosHumanos", "Feminino", "32");
        System.out.println(func.toString());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System .out.println(f3.toString());
    }
}
