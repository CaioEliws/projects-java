import br.com.caio.challengue.models.Product;
import br.com.caio.challengue.models.ProductPerishable;

import java.util.ArrayList;

public class Main {
    static void main() {
        Product tv = new Product("TV", 1, 299.99);

        ArrayList<Product> listProducts = new ArrayList<Product>();
        listProducts.add(tv);

        ProductPerishable monitor = new ProductPerishable("Monitor", 2, 899.99, "19/09");
        listProducts.add(monitor);

        System.out.println("Tamanho lista de produtos: " + listProducts.size());
        System.out.println("Primeiro produto: " + listProducts.get(0).getName());
        System.out.println(listProducts);
    }
}