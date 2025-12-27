package ex01;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(57);
        numbers.add(77);
        numbers.add(54);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}