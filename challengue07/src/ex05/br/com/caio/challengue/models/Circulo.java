package ex05.br.com.caio.challengue.models;

import ex05.br.com.caio.challengue.calc.Forma;

public class Circulo implements Forma {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public int calcularArea() {
        return (int) (Math.PI * (raio * raio));
    }
}
