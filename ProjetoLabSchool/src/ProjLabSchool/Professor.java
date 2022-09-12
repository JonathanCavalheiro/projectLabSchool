package ProjLabSchool;

public class Professor extends Pessoa{
    private String formacaoAacademica;
    private String experiencia;
    private String situacaoProfessor;

    public Professor(){
    }
    public Professor(String formacaoAacademica,String experiencia,String situacaoProfessor){
        this.situacaoProfessor = situacaoProfessor;
        this.experiencia = experiencia;
        this.formacaoAacademica = formacaoAacademica;
    }
    public String getFormacaoAacademica() {
        return formacaoAacademica;
    }

    public void setFormacaoAacademica(String formacaoAacademica) {
        this.formacaoAacademica = formacaoAacademica;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getSituacaoProfessor() {
        return situacaoProfessor;
    }

    public void setSituacaoProfessor(String situacaoProfessor) {
        this.situacaoProfessor = situacaoProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "formacaoAacademica='" + formacaoAacademica + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", situacaoProfessor='" + situacaoProfessor + '\'' +
                "} " + super.toString();
    }
}
