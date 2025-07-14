package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo {

    private int nivelDificuldade; // de 1 a 5

    public Desafio() {}

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * nivelDificuldade * 1.5;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nível de dificuldade=" + getNivelDificuldade() +
                '}';
    }
}
