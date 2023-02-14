package sets.ordenacao;

/*Dadas as seguintes informações sobre as minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: The Blacklist, genero: policial, tempoEpisodio: 60
Série 2 = nome: Dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: Modern Family, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class Series {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("The Blacklist", "policial", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Modern Family", "comédia", 25));
        }};
        for (Serie serie: minhasSeries) {
            System.out.format("%s - %s - %s \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("The Blacklist", "policial", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Modern Family", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.format("%s - %s - %s \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.format("%s - %s - %s \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) {
            System.out.format("%s - %s - %s \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }

    }
}

