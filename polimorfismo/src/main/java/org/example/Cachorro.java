package org.example;

public class Cachorro  implements animal{
    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String comer() {
        return "Au";


    }
}
