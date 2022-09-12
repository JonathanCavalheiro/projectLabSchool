package ProjLabSchool;

public class Pedagogo extends Pessoa {
    int contagemAtendimento;

    public Pedagogo (){

    }

    public int getContagemAtendimento() {
        return contagemAtendimento;
    }

    public void setContagemAtendimento(int contagemAtendimento) {
        this.contagemAtendimento = contagemAtendimento;
    }

    @Override
    public String toString() {
        return "Pedagogo{" +
                "contagemAtendimento=" + contagemAtendimento +
                "} " + super.toString();
    }
}
