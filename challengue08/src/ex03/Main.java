package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> listProducts = new LinkedList<>();
        listProducts.add("Monitor");
        listProducts.add("Tv");
        listProducts.add("Placa de vídeo");
        listProducts.add("Processador");
        listProducts.add("Memoria RAM");
        listProducts.add("SSD");
        listProducts.add("HD");

        List<String> listPerifericos = new ArrayList<>();
        listPerifericos.add("Fone");
        listPerifericos.add("Microfone");
        listPerifericos.add("Mouse");
        listPerifericos.add("Cadeira");


        System.out.println("LinkedList: " + listProducts);
        System.out.println("ArrayList: " + listPerifericos);
    }
}
