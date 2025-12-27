import br.com.caio.challengue.models.Aluno;
import br.com.caio.challengue.models.ContaBancaria;
import br.com.caio.challengue.models.Livro;
import br.com.caio.challengue.models.Produto;

public class Main {
    static void main() {
        /*
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "Caio Elias Vieira";
        contaBancaria.setAccountNumber(8259);
        contaBancaria.setSaldo(5000);

        System.out.println("O titular da conta é: " + contaBancaria.titular);
        System.out.println("O numero da conta é: " + contaBancaria.getAccountNumber());
        System.out.println("O saldo da conta é de: " + contaBancaria.getSaldo());
         */

        /*
        Produto product = new Produto();

        product.setName("Processador AMD 7700X");
        product.setPrice(2000);

        product.setDesconto(20);

        System.out.println("Nome do produto: "  + product.getName());
        System.out.println("Preço do produto: " +  product.getPrice());
        System.out.println("Preço do produto com desconto: " +  product.aplicarDesconto());
         */

        /*
        Aluno aluno = new Aluno();

        aluno.setName("Caio Elias Vieira");
        aluno.setGrades(10);
        aluno.setGrades(8);
        aluno.setGrades(5);
        aluno.setGrades(7);

        System.out.println("Nome do aluno: " + aluno.getName());
        System.out.println("Media das notas: " + aluno.average());
         */

        Livro livro = new Livro();

        livro.setAuthor("Caio Elias Vieira");
        livro.setTitle("O incrivel mundo de Caio");

        System.out.printf(livro.exibirDetalhes());
    }
}