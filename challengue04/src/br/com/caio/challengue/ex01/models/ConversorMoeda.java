package br.com.caio.challengue.ex01.models;

import br.com.caio.challengue.ex01.calc.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal() {
        return dolar * 5.55;
    }
}
