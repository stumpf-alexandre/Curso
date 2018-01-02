package Curso;

import java.util.ArrayList;

public class Turma {
    private Curso curso;
    private long codigo;
    private ArrayList<Matricula> matriculas;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Matricula> getMatriculas(){
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula>matriculas){
        this.matriculas=matriculas;
    }

    public boolean criarTurma(){
        if(matriculas.size()>=20){
            return true;
        }
        else
            return false;
    }
}
