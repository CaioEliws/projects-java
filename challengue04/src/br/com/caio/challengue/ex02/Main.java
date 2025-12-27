package br.com.caio.challengue.ex02;

import br.com.caio.challengue.ex02.models.CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        calculadora.setAltura(10);
        calculadora.setLargura(20);

        System.out.println(calculadora.calcularArea());
        System.out.println(calculadora.calcularPerimetro());
    }
}
