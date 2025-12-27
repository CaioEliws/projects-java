package ex05.br.com.caio.challengue;

import ex05.br.com.caio.challengue.calc.Forma;
import ex05.br.com.caio.challengue.models.Circulo;
import ex05.br.com.caio.challengue.models.Quadrado;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Quadrado quadrado = new Quadrado(10, 10);

        ArrayList<Forma> listCalc = new ArrayList<>();
        listCalc.add(circulo);
        listCalc.add(quadrado);

        for (Forma item : listCalc) {
            System.out.println(item.calcularArea());
        }
    }
}
