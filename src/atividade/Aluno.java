package atividade;

public class Aluno {
    private int idAluno;
    private String nome;
    private Professor idProfessor;

    public Aluno(int idAluno, String nome, Professor idProfessor) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.idProfessor = idProfessor;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Professor idProfessor) {
        this.idProfessor = idProfessor;
    }
}