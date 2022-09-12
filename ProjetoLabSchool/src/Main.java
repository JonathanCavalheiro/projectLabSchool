import ProjLabSchool.Aluno;
import ProjLabSchool.Pedagogo;
import ProjLabSchool.Pessoa;
import ProjLabSchool.Professor;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoUsuario;
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Pedagogo> pedagogos = new ArrayList<>();

        while (true) {
            System.out.println("---- MENU DE CADASTROS ----\n1 - Cadastrar Aluno\n2 - Cadastrar Professor\n3 -" +
                    " Pedagogo\n4 - Relat�rios\n5 - Alterar Situa��o de Matriculas\n6 - SAIR");
            System.out.println("---------------------------");
            opcaoUsuario = input.nextInt();
            Aluno alunoNovo = new Aluno();

            switch (opcaoUsuario) {
                case 1:

                    System.out.println("----- CADASTRO DE ALUNO ----");
                    System.out.println("Informe o nome do aluno:");
                    alunoNovo.setNome(input.next());
                    System.out.println("Informe o cpf: (apenas n�meros)");
                    alunoNovo.setCpf(input.next());
                    System.out.println("Informe a nota do aluno de 0 a 10:");
                    alunoNovo.setNota(input.nextDouble());
                    System.out.println("Informe telefone: (apenas n�meros)");
                    alunoNovo.setTelefone(input.next());
                    System.out.println("Informe a data da nascimento: (dd/mm/aaaa)");
                    alunoNovo.setDataNasc(input.next());
                    System.out.println("Informe a situa��o do aluno\n1- Ativo\n2- Irregular\n3- Atendimento Pedag�gico\n4-" +
                            " Inativo");
                    int ativoAluno = input.nextInt();
                    switch (ativoAluno) {
                        case 1:
                            alunoNovo.setSituacaoMatri("Ativo");
                            break;
                        case 2:
                            alunoNovo.setSituacaoMatri("Irregular");
                            break;
                        case 3:
                            alunoNovo.setSituacaoMatri("Atendimendo Pedag�gico");
                            break;
                        case 4:
                            alunoNovo.setSituacaoMatri("Inativo");
                            break;
                    }
                    alunos.add(alunoNovo);
                    alunoNovo.setId(alunos.size());
                    break;

                case 2:
                    Professor professorNovo = new Professor();
                    System.out.println("---- CADASTRO DE PROFESSOR ----");
                    System.out.println("Informe o nome do Professor:");
                    professorNovo.setNome(input.next());
                    System.out.println("Informe o cpf: (apenas n�meros)");
                    professorNovo.setCpf(input.next());
                    System.out.println("Informe telefone: (apenas n�meros)");
                    professorNovo.setTelefone(input.next());
                    System.out.println("Informe a data da nascimento: (dd/mm/aaaa)");
                    professorNovo.setDataNasc(input.next());
                    // System.out.println("");
                    System.out.println("Informe N�vel de Forma��o\n1- Gradua��o incompleta\n2- Gradua��o Completa\n3- " +
                            "Mestrado\n4- Doutorado");
                    int opcaoUser = input.nextInt();
                    switch (opcaoUser) {
                        case 1:
                            professorNovo.setFormacaoAacademica("Gradua��o Incompleta");
                            break;
                        case 2:
                            professorNovo.setFormacaoAacademica("Gradua��o Completa");
                            break;
                        case 3:
                            professorNovo.setFormacaoAacademica("Mestrado");
                            break;
                        case 4:
                            professorNovo.setFormacaoAacademica("Doutorado");
                            break;
                    }
                    System.out.println("Informe qual a experiencia em desenvolvimento\n1- Front-End\n2- Back-End\n3- Full-Stack");
                    int opcaoExperiencia = input.nextInt();
                    switch (opcaoExperiencia) {
                        case 1:
                            professorNovo.setExperiencia("Front-End");
                            break;
                        case 2:
                            professorNovo.setExperiencia("Back-End");
                            break;
                        case 3:
                            professorNovo.setExperiencia("Full-Stack");
                            break;
                    }
                    System.out.println("Informe a situa��o do professor\n1- Ativo\n2- Inativo");
                    int opcaoAtivo = input.nextInt();
                    if (opcaoAtivo == 1) {
                        professorNovo.setSituacaoProfessor("Ativo");
                    } else {
                        professorNovo.setSituacaoProfessor("Inativo");
                    }
                    professores.add(professorNovo);
                    professorNovo.setId(professores.size());

                    break;
                case 3:
                    Pedagogo pedagogo = new Pedagogo();
                    System.out.println("----- CADASTRO DE PEDAGOGO ----");
                    System.out.println("Informe o nome do pedagogo:");
                    pedagogo.setNome(input.next());
                    System.out.println("Informe o cpf: (apenas n�meros)");
                    pedagogo.setCpf(input.next());
                    System.out.println("Informe telefone: (apenas n�meros)");
                    pedagogo.setTelefone(input.next());
                    System.out.println("Informe a data da nascimento: (dd/mm/aaaa)");
                    pedagogo.setDataNasc(input.next());
                    pedagogos.add(pedagogo);
                    pedagogo.setId(pedagogos.size());
                    break;

                case 4:
                    System.out.println("---- Menu de Relat�rios ----");
                    System.out.println("1- Alunos\n2- Professores\n3- Funcion�rios\n4- Todos");
                    int opcaoRelatorios = input.nextInt();
                    switch (opcaoRelatorios) {
                        case 1:
                            System.out.println("----- Relat�rio Alunos -----\n1- Ativo\n2- Irregular\n3- Atendimento Pedag�gico\n4- Inativo\n5- Todos\n");
                            int opcaoMenuAluno = input.nextInt();
                            switch (opcaoMenuAluno) {
                                case 1:
                                    System.out.println("---- ALUNOS ATIVOS ----");
                                    for (Aluno aluno01 : alunos) {
                                        if (aluno01.getSituacaoMatri().equals("Ativo")) {
                                            ;
                                            System.out.println("Id: " + aluno01.getId());
                                            System.out.println("Nota do aluno: " + aluno01.getNota());
                                        }
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 2:
                                    System.out.println("---- ALUNOS IRREGULARES ----");
                                    for (Aluno aluno01 : alunos) {
                                        if (aluno01.getSituacaoMatri().equals("Irregular")) {
                                            ;
                                            System.out.println("Id: " + aluno01.getId());
                                            System.out.println("Nota do aluno: " + aluno01.getNota());
                                        }
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 3:
                                    System.out.println("---- ALUNOS EM ATENDIMENTO PEDAG�GICO ----");
                                    for (Aluno aluno01 : alunos) {
                                        if (aluno01.getSituacaoMatri().equals("Atendimento Pedag�gico")) {
                                            ;
                                            System.out.println("Id: " + aluno01.getId());
                                            System.out.println("Nota do aluno: " + aluno01.getNota());
                                        }
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 4:
                                    System.out.println("---- ALUNOS INATIVOS ----");
                                    for (Aluno aluno01 : alunos) {
                                        if (aluno01.getSituacaoMatri().equals("Inativo")) {
                                            ;
                                            System.out.println("Id: " + aluno01.getId());
                                            System.out.println("Nota do aluno: " + aluno01.getNota());
                                        }
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 5:
                                    System.out.println("---- TODOS ALUNOS ----");
                                    for (Aluno aluno01 : alunos) {
                                        System.out.println("Id: " + aluno01.getId());
                                        System.out.println("Nota do aluno: " + aluno01.getNota());
                                    }
                                    System.out.println("-----------");
                            }
                            break;
                        case 2:
                            System.out.println("----- Relat�rio Professores -----\n1- Front-End\n2- Back-End\n3-Full-Stack\n4- Todos\n");
                            int opcaoProfessor = input.nextInt();
                            switch (opcaoProfessor) {
                                case 1:
                                    System.out.println("---- PROFESSORES FRONT-END ----");
                                    for (Professor professor : professores) {
                                        if (professor.getExperiencia().equals("Front-End")) {
                                            System.out.println("Id: " + professor.getId());
                                            System.out.println("Nome do professor: " + professor.getNome());
                                            System.out.println("-----------");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("---- PROFESSORES BACK-END ----");
                                    for (Professor professor : professores) {
                                        if (professor.getExperiencia().equals("Back-End")) {
                                            System.out.println("Id: " + professor.getId());
                                            System.out.println("Nome do professor: " + professor.getNome());
                                            System.out.println("-----------");
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("---- PROFESSORES FULL-STACK ----");
                                    for (Professor professor : professores) {
                                        if (professor.getExperiencia().equals("Full-Stack")) {
                                            System.out.println("Id: " + professor.getId());
                                            System.out.println("Nome do professor: " + professor.getNome());
                                            System.out.println("-----------");
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("---- TODOS PROFESSORES ----");
                                    for (Professor professor : professores) {
                                        System.out.println("Id: " + professor.getId());
                                        System.out.println("Nome do professor: " + professor.getNome());
                                        System.out.println("-----------");
                                    }
                                    break;
                            }
                        case 3:
                            System.out.println("----- FUNCION�RIOS ----");
                            pedagogos.forEach(pedagogo1 -> {
                                System.out.println("Id: " + pedagogo1.getId());
                                System.out.println("Nome do professor: " + pedagogo1.getNome());
                                System.out.println("CPF:" + pedagogo1.getCpf() + "\n");
                            });

                            break;

                        case 4:
                            System.out.println("---- ALUNOS ----");
                            alunos.forEach(aluno -> {
                                System.out.println("Id: " + aluno.getId());
                                System.out.println("Nome do aluno: " + aluno.getNome());
                                System.out.println(aluno.getSituacaoMatri());
                                System.out.println("CPF:" + aluno.getCpf() + "\n");
                            });
                            System.out.println("---- PROFESSORES ----");
                            professores.forEach(professor -> {
                                System.out.println("Id: " + professor.getId());
                                System.out.println("Nome do professor: " + professor.getNome());
                                System.out.println("CPF:" + professor.getCpf() + "\n");
                            });
                            System.out.println("---- PEDAGOGOS ----");
                            pedagogos.forEach(pedagogo1 -> {
                                System.out.println("Id: " + pedagogo1.getId());
                                System.out.println("Nome do professor: " + pedagogo1.getNome());
                                System.out.println("CPF:" + pedagogo1.getCpf() + "\n");
                            });

                            break;

                    }
                    break;

                case 5:
                    // rever daqui para baixo, dando erro em alterar a situa��o da matricula
                    System.out.println("Informe Id do aluno para alterar sua situa��o");
                    int alteracaoId = input.nextInt();
                    for (Aluno aluno02 : alunos) {
                        if (aluno02.getId() == alteracaoId) {
                            System.out.println("Nome do aluno: "+aluno02.getNome());
                            System.out.println("Aluno est� com a situa��o: " + aluno02.getSituacaoMatri());
                            System.out.println("");
                            System.out.println("---- Esolha a nova situa��o para matricula do aluno ----\n" +
                                    "1- Ativo\n2- Irregular\n3- Inativo\n4- Atendimento Pedag�gico\n");

                            int opcaoAlteracao = input.nextInt();
                            switch (opcaoAlteracao) {
                                case 1:
                                    for (Aluno aluno : alunos) {
                                        String alteracao = "Ativo";
                                        System.out.println("Aluno foi altera para situa��o Ativo");
                                        aluno.setSituacaoMatri(alteracao);
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 2:
                                    for (Aluno aluno : alunos) {
                                        String alteracao = "Irregular";
                                        System.out.println("Aluno foi altera para situa��o Irregular");
                                        aluno.setSituacaoMatri(alteracao);
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 3:
                                    for (Aluno aluno : alunos) {
                                        String alteracao = "Inativo";
                                        System.out.println("Aluno foi altera para situa��o Inativo");
                                        aluno.setSituacaoMatri(alteracao);
                                        System.out.println("-----------");
                                    }
                                    break;
                                case 4:
                                    for (Aluno aluno : alunos) {
                                        String alteracao = "Atendimento Pedag�gico";
                                        System.out.println("Aluno foi altera para situa��o Atendimento Pedag�gico");
                                        aluno.setSituacaoMatri(alteracao);
                                        System.out.println("-----------");
                                        break;
                                    }


                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo.....");
                    System.exit(0);
                    break;


            }
        }
    }
}
