package atividade;

public class Turma {
    public int idTurma;
    private String nome;

    public Turma(int idTurma, String nome) {
        this.idTurma = idTurma;
        this.nome = nome;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
