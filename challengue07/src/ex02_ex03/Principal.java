package ex02_ex03;

import ex02_ex03.br.com.caio.challengue.models.Animal;
import ex02_ex03.br.com.caio.challengue.models.Cachorro;

public class Principal {
    static void main(String[] args) {
        Animal animal = new Cachorro();

        animal.setName("Zeus");
        animal.setAge(5);
        animal.setSize("Big");

        if (animal instanceof Cachorro cachorro) {
            System.out.println(cachorro.getName());
            System.out.println(cachorro.getAge());
            System.out.println(cachorro.getSize());
        }
    }
}
