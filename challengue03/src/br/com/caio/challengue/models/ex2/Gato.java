package br.com.caio.challengue.models.ex2;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando moveis");
    }
}
