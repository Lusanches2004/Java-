package org.example;

public class Gato implements animal{
    @Override
    public String emitirSom() {
        return "Miau Miau";
    }

    @Override
    public String comer() {
        return "Ga";


    }
}
