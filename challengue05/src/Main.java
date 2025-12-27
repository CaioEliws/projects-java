import br.com.caio.challengue.models.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setName("Caio");
        p1.setAge(20);

        Pessoa p2 = new Pessoa();
        p2.setName("Carlos");
        p2.setAge(30);

        Pessoa p3 = new Pessoa();
        p3.setName("Roberto");
        p3.setAge(40);

        ArrayList<Pessoa> listPeople = new ArrayList<>();
        listPeople.add(p1);
        listPeople.add(p2);
        listPeople.add(p3);
        System.out.println("Quantidade de pessoas: " + listPeople.size());
        System.out.println("Primeira pessoa: " + listPeople.get(0).getName());
        System.out.println(listPeople);
    }
}