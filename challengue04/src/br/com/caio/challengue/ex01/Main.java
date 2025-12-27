package br.com.caio.challengue.ex01;

import br.com.caio.challengue.ex01.models.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();

        moeda.setDolar(10);
        System.out.println(moeda.converterDolarParaReal());
    }
}
