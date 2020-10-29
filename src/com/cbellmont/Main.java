package com.cbellmont;

public class Main {

    public static void main(String[] args) {
        Piscina p = new Piscina();
        for (int i = 0; i < 10; i++){
            Banista t = new Banista(p);
            t.setName("Hilo " + i);
            t.start();
        }
    }
}
