public class Musica {
    String title;
    String artist;
    int yearOfRelease;

    int sumAvaliacao;
    int totalAvaliacao;
    int mediaAvaliacao;

    void exibirFicha () {
        System.out.println("O titulo da musica é: " + title);
        System.out.println("O nome do artista é: " + artist);
        System.out.println("O ano de lançamento da musica é: " + yearOfRelease);
    }

    void reviews (double grade) {
        sumAvaliacao += grade;
        totalAvaliacao++;
        mediaAvaliacao = sumAvaliacao / totalAvaliacao;
    }
}
