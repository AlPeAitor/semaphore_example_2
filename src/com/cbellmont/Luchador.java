package com.cbellmont;

public class Luchador extends Thread {


    @Override
    public void run() {
        try {
            Cuadrilatero.AddParticipante(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}