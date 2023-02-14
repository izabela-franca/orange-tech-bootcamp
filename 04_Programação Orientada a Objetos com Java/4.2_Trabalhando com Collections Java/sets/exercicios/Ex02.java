package sets.exercicios;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
*/

import java.util.*;

public class Ex02 {

    public static void main(String[] args) {

        Set<Ex02_LinguagemFavorita> linguagens = new HashSet<>();
        linguagens.add(new Ex02_LinguagemFavorita("Python", 1991, "Pycharm"));
        linguagens.add(new Ex02_LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        linguagens.add(new Ex02_LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<Ex02_LinguagemFavorita> linguagens2 = new LinkedHashSet<>(Arrays.asList(
                new Ex02_LinguagemFavorita("Python", 1991, "Pycharm"),
                new Ex02_LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                new Ex02_LinguagemFavorita("Java", 1991, "Visual Studio Code")
        ));
        for (Ex02_LinguagemFavorita linguagem : linguagens2) {
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<Ex02_LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens);
        for (Ex02_LinguagemFavorita linguagem : linguagens3) {
            System.out.println(linguagem);
        }

    }
}
