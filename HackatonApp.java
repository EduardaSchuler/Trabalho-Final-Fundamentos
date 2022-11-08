import java.util.Scanner;

public class HackatonApp{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    String nomeTime, nomeAluno, emailAluno;
    int matriculaALuno, qtdTimes, qtdeAlunos, x = 0, y = 0;
    double notaTime;

    System.out.println("Quantos times há nesta Hackaton? ");
    qtdTimes = in.nextInt();

    if (qtdTimes >= 0 && qtdTimes <= 15){
      do{
        System.out.println("Digite o nome do time: ");
        nomeTime = in.nextLine();
        System.ou.println("Digite a nota deste time: ");
        notaTime = in.nextDouble();
        System.out.println("Quantos alunos há neste time");
        qtdAlunos = in.nextInt();
        Time time = new Time(nomeTime, notaTime, qtdAlunos);
        
        if (qtdAlunos >= 0 && qtdAlunos <= 15){
          do {
            
          } while (y < qtdAlunos);
        }
        x++;
      } while (x < qtdTimes);
    } else {
      System.out.println("Quantidade de times inválida.");
    }
  }
}