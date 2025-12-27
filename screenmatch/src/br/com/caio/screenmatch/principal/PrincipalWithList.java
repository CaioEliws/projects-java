package br.com.caio.screenmatch.principal;

import br.com.caio.screenmatch.models.Movie;
import br.com.caio.screenmatch.models.Serie;
import br.com.caio.screenmatch.models.Title;

import java.util.*;

public class PrincipalWithList {
    static void main(String[] args) {
        Movie starWars = new Movie("Star Wars", 1989);
        starWars.review(10);
        Movie batman = new Movie("Batman", 1999);
        batman.review(8);
        Movie venom = new Movie("Venom", 2017);
        venom.review(6);
        Serie the100 = new Serie("The 100", 2017);
        the100.review(7);

        List<Title> listWatched = new LinkedList<>();
        listWatched.add(venom);
        listWatched.add(batman);
        listWatched.add(starWars);
        listWatched.add(the100);

        for (Title item: listWatched) {
            System.out.println(item.getName());

            if (item instanceof Movie movie &&  movie.getRateable() > 2) {
                System.out.println("Classificação: " + movie.getRateable());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Zeca");
        buscaPorArtista.add("Arnold Schawa");
        buscaPorArtista.add("Caio Elias");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(listWatched);
        System.out.println("Lista de titulos ordenada: " + listWatched);

        listWatched.sort(Comparator.comparing(Title::getYearReleased));
        System.out.println("Filtrando pelo ano: " + listWatched);
    }
}
