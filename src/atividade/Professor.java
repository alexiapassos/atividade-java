package atividade;

public class Professor {
    private int idProfessor;
    private String nome;
    private Turma idTurma;

    public Professor(int idProfessor, String nome, Turma idTurma) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.idTurma = idTurma;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Turma idTurma) {
        this.idTurma = idTurma;
    }
}