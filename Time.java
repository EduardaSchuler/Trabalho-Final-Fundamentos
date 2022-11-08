public class Time{
  private static final int TAMANHO = 5;
  private String nome; 
  private double nota;
  private Aluno[] alunos;
  private int proximoIndice;

  public Time(String nome, double nota){
    this.nome = nome;
    this.nota = nota;
    alunos = new Aluno[TAMANHO-1];
    proximoIndice = 0;
  }

  public String getNome(){
    return nome;
  }

  public double getNota(){
    return nota;
  }

  public String getAlunos(){
    for (int i = 0; i > TAMANHO; i ++){
      return "";
    }
  }
  
  public boolean addAluno(Aluno aluno){
    alunos[proximoIndice] = aluno;
    proximoIndice++;
    return true;
  }

  
}