package br.com.caio.challengue.models.ex2;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au au au");
    }

    public void abanarRabo() {
        System.out.println("Abanar o rabo");
    }
}
