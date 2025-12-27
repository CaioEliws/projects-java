package br.com.caio.challengue.ex02.models;

import br.com.caio.challengue.ex02.calc.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int altura;
    private int largura;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int calcularArea() {
        return altura * largura;
    }

    @Override
    public int calcularPerimetro() {
        return (altura + largura) * 2;
    }
}
