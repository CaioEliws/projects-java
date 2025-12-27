package ex04;

import ex04.br.com.caio.challengue.models.Product;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Product monitor = new Product("Monitor", 890.90);
        Product tv = new Product("TV", 1790.90);

        ArrayList<Product> listProducts = new ArrayList<Product>();
        listProducts.add(monitor);
        listProducts.add(tv);

        for (Product item : listProducts){
            double sum = 0;
            sum += item.getPrice();
            System.out.println(sum);
        }
    }
}
