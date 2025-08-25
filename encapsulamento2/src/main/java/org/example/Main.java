package org.example;

public class Main {
    public static void main(String[] args) {
   exemplo cl= new exemplo("Rex", 5, "Labrador");
   cliente ct= new cliente("João", "123.456.789-00", "(11) 98765-4321");

    System.out.println(cl.toString());
    System.out.println(ct.toString());
    }
}