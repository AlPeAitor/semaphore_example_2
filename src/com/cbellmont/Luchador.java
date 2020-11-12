package com.cbellmont;

public class Luchador extends Thread {


    @Override
    public void run() {
        try {
            Cuadrilatero.addParticipante(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}