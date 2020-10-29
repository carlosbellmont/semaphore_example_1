package com.cbellmont;

import java.util.Random;

public class Banista extends Thread {

    Piscina piscina;
    public Banista(Piscina piscina) {
        this.piscina = piscina;
    }
    @Override
    public void run() {
        try {
            piscina.comenzarBano(this);
            int duracion = new Random().nextInt(5000) + 1000;
            System.out.println("Yujuuuu! soy " + getName() + " y me estoy bañando por " + duracion);
            sleep(duracion);
            System.out.println("Ya me he cansado... " + getName() + " se va a casa");
            piscina.finalizarBano(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
