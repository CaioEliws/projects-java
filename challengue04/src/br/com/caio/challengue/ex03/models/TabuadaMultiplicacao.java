package br.com.caio.challengue.ex03.models;

import br.com.caio.challengue.ex03.calc.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}