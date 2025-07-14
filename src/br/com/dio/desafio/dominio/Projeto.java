package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo{

    private int estimativaHoras;

    public Projeto() {}

    public int getEstimativaHoras() {
        return estimativaHoras;
    }

    public void setEstimativaHoras(int estimativaHoras) {
        this.estimativaHoras = estimativaHoras;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * estimativaHoras * 1.2;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", estivativa de duração=" + getEstimativaHoras() +
                '}';
    }
}
