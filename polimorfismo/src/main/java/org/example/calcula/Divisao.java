package org.example.calcula;

public class Divisao implements  Operacaomatematica{
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
