package com.cbellmont;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Cuadrilatero {

    private static final int MAX_AVAILABLE = 2;
    private static final Semaphore available = new Semaphore(MAX_AVAILABLE, true);

    private static Luchador ganador;
    public static void AddParticipante(Luchador luchador) throws InterruptedException {
        available.acquire();
        System.out.println("Entra al ring el luchador " + luchador.getName());
        if (ganador == null ) {
            ganador = luchador;
        } else {
            System.out.println("Comienza la pelea entre " + luchador.getName() + " y " + ganador.getName());
            Thread.sleep(2000);
            pelear(ganador, luchador);
        }
    }

    private static void pelear(Luchador ganador, Luchador luchador) {
        Random r = new Random();
        if (r.nextBoolean()){
            Cuadrilatero.ganador = luchador;
        }
        available.release();
        System.out.println("El ganador ha sido " + ganador.getName());
    }
}
