package ex02;

import ex02.br.com.caio.challengue.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Title shrek = new Title("Shrek");
        Title flash = new Title("Flash");
        Title venom = new Title("Venom");
        Title marvel = new Title("Marvel");
        Title tron = new Title("Tron");
        Title alvin = new Title("Alvin e os esquilos");

        List<Title> listTitles = new LinkedList<>();
        listTitles.add(shrek);
        listTitles.add(flash);
        listTitles.add(venom);
        listTitles.add(marvel);
        listTitles.add(tron);
        listTitles.add(alvin);

        Collections.sort(listTitles);
        System.out.println(listTitles);
    }
}
