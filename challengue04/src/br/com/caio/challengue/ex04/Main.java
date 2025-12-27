package br.com.caio.challengue.ex04;

import br.com.caio.challengue.ex04.models.Livro;
import br.com.caio.challengue.ex04.models.Product;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("Livro 1");
        livro1.setAuthor("Caio");
        livro1.setPrice(100);

        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getAuthor());

        System.out.println("O preço final com taxa é: " + livro1.calcularPrecoFinal());

        Product product = new Product();

        product.setName("TV");
        product.setType("Eletronico");
        product.setPrice(100);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println("Preço final com desconto é: " + product.calcularPrecoFinal());
    }
}