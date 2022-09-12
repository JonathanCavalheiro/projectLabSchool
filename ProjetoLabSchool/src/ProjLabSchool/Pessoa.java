package ProjLabSchool;

public abstract class Pessoa {

   private   String nome;
     private String cpf;
     private String telefone;
     private String dataNasc;
    private int id;

    public Pessoa(String nome, String cpf, String telefone, String dataNasc, int id){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.id = id;
    }
    public Pessoa(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", id=" + id +
                '}';
    }
}
