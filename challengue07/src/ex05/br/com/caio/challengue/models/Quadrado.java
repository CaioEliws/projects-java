package ex05.br.com.caio.challengue.models;

import ex05.br.com.caio.challengue.calc.Forma;

public class Quadrado implements Forma {
    private int base;
    private int altura;

    public Quadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return base * altura;
    }
}
