public class Carro {
    // Atributos
    String modelo;
    String cor;
    int anoFabricacao;

    void exibirModelo () {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
    void calcCarro () {
        int calc = 2025 - anoFabricacao;
        System.out.println("A idade do carro é: " + calc);
    }
}
