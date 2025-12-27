public class Principal {
    public static void main(String[] args) {
        /* Pessoa pessoa = new Pessoa();
        Calculadora calculator = new Calculadora();

        System.out.println(pessoa.messageHi());

        calculator.calcNumber(); */

        /* Musica music = new Musica();

        music.title = "Cansão de ninar";
        music.artist = "Japonego";
        music.yearOfRelease = 1958;

        music.exibirFicha();

        music.reviews(5);
        music.reviews(8);
        music.reviews(9);
        music.reviews(4);
        music.reviews(10);
        System.out.println("A media de avalições é: " + music.mediaAvaliacao); */

        Carro carro = new Carro();

        carro.cor = "Azul";
        carro.modelo = "Porshe";
        carro.anoFabricacao = 2021;
        carro.exibirModelo();
        carro.calcCarro();
    }
}