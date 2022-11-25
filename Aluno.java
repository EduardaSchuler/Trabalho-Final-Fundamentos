
/**
 * Criação do aluno com os atributos: nome, matricula e email
 * 
 * @author (Eduarda Sobreira, Larissa Oliveira e Maria Eduarda Schüler) 
 * @version (-)
 */
public class Aluno {
    private String nome, email;
    private int matricula;

    public Aluno (String nome, int matricula, String email){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        return "Aluno: " + getNome() + ", sob a matrícula " + getMatricula() + ", vinculado ao e-mail " + getEmail();
    }
}
