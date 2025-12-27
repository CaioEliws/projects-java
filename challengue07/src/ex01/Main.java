package ex01;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Caio");
        names.add("Lucas");
        names.add("Edu");

        for(String name : names){
            System.out.println(name);
        }
    }
}