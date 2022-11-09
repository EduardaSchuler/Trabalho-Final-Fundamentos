import java.util.Scanner;

public class HackatonApp{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    String nomeTime, nomeAluno, emailAluno;
    int matriculaAluno, qtdTimes, qtdeAlunos, x = 0, y = 0;
    double notaTime;

    System.out.println("Quantos times há nesta Hackaton? ");
    qtdTimes = in.nextInt();

    if (qtdTimes >= 0 && qtdTimes <= 15){
      do{
        System.out.println("Digite o nome do time: ");
        nomeTime = in.nextLine();
        System.out.println("Digite a nota deste time: ");
        notaTime = in.nextDouble();
        System.out.println("Quantos alunos há neste time? ");
        qtdeAlunos = in.nextInt();
        
        Time time = new Time(nomeTime, notaTime, qtdeAlunos);
        
        if (qtdeAlunos >= 0 && qtdeAlunos <= 15){
          do {
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = in.nextLine();
            System.out.println("Digite a matricula deste aluno: ");
            matriculaAluno = in.nextInt();
            System.out.println("Digite o email deste alunos: ");
            emailAluno = in.nextLine();
            
            Aluno aluno = new Aluno(nomeAluno, matriculaAluno, emailAluno);
            
            if (addAluno(aluno) == true){
                System.out.println("Aluno Adicionado");
            } else {
                System.out.println("Aluno não adicionado");
            }
            y++;
          } while (y < qtdeAlunos);
        } else {
          System.out.println("Quantidade de alunos inválida.");
        }
        x++;
      } while (x < qtdTimes);
    } else {
      System.out.println("Quantidade de times inválida.");
    }
  }
}