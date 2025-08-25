package org.example.cbf;

public class main2{
    public static void main(String[] args) {
        funcionarioc fc= new funcionarioc("001", "Maria Silva", "Rua A, 123", "(11) 91234-5678", "maria@gmail.com", "12345-6");
        contaba cb= new contaba("Banco XYZ", "0001", "12345-6", "Corrente", 1500.00, "500.00");


        System.out.println(fc.toString());
        System.out.println(cb.toString());
    }

}
