package Curso;

public class Matricula {
    private Aluno aluno;
    private Turma turma;
    private long numeroMatricula;

    public long getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(long numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
