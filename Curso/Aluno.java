package Curso;

public class Aluno {
    private long codigo;
    private String nome;
    private long telefone;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public Aluno(long codigo, String nome, long telefone){
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
    }

    public void exibirAluno(){
        System.out.println("Código do aluno: "+getCodigo());
        System.out.println("Nome do aluno: "+getNome());
        System.out.println("Telefone do aluno: "+getTelefone());
    }
}
