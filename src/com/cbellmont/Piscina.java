package com.cbellmont;

import java.util.concurrent.Semaphore;

public class Piscina {

    private static final int MAX_AVAILABLE = 4;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);


    public void comenzarBano(Banista banista) throws InterruptedException {
        available.acquire();

    }

    public void finalizarBano(Banista banista) {
        available.release();
    }
}
