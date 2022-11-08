public class Time{
  private String nome; 
  private double nota;
  private Aluno[] alunos;
  private int proximoIndice, tamanho;

  public Time(String nome, double nota, tamanho){
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

  public String toString(){
    String saida = "O time " + getNome() + " ficou com a nota " + getNota();
    for (int i = 0; i < proximoIndice; i++){
        saida = saida + "\nTime composto por:" + "\n" + alunos[i].toString(); 
    }
    return saida;
  }
}