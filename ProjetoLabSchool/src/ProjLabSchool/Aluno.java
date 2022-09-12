package ProjLabSchool;

public class Aluno extends Pessoa{
    private double nota;
    private String situacaoMatri;

    public Aluno(double nota, String situacaoMatri, String nome, String cpf, String telefone,
                 String dataNasc, int id ){
        super(nome,cpf,telefone,dataNasc,id);
        this.nota = nota;
        this.situacaoMatri = situacaoMatri;
    }
    public Aluno(){
    }


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSituacaoMatri() {
        return situacaoMatri;
    }

    public void setSituacaoMatri(String situacaoMatri) {
        this.situacaoMatri = situacaoMatri;
    }


    public void setNome() {
    }

    public void setCpf() {
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                ", situacaoMatri='" + situacaoMatri + '\'' +
                "} " + super.toString();
    }
}
