package sets.exercicios;

public class Ex02_LinguagemFavorita implements Comparable<Ex02_LinguagemFavorita>{

    private String nome;
    private int anoDeCriacao;
    private String IDE;

    public Ex02_LinguagemFavorita(String nome, int anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "Ex01_LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao='" + anoDeCriacao + '\'' +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(Ex02_LinguagemFavorita linguagem) {
        return this.nome.compareTo(linguagem.nome);
    }
}
