
/**
 * Criação da classe Time com os seguintes atributos: nome, nota e lista de alunos
 * 
 * @author (Eduarda Sobreira, Larissa Oliveira e Maria Eduarda Schüler) 
 * @version (um número da versão ou uma data)
 */
public class Time{
    private String nome; 
    private double nota;
    private Aluno[] alunos;
    private int proximoIndice, tamanho;

    public Time(String nome, double nota, int tamanho){
        this.nome = nome;
        this.nota = nota;
        alunos = new Aluno[tamanho];
        proximoIndice = 0;
    }

    public String getNome(){
        return nome;
    }

    public double getNota(){
        return nota;
    }

    public boolean addAluno(Aluno aluno){
        alunos[proximoIndice] = aluno;
        proximoIndice++;
        return true;
    }

    public String exibeTodosAlunos(){
        String saida = "";
        for (int i = 0; i < proximoIndice; i++){
            saida = saida + alunos[i].toString() + "\n";
        }
        return saida;
    }

    public String toString(){
        String saida = "O time " + getNome() + " ficou com a nota " + getNota() + "\nTime composto por:" + "\n" + exibeTodosAlunos();
        return saida;
    }
}
