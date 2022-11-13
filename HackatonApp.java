
/**
 * Escreva uma descrição da classe HackatonApp aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class HackatonApp{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        String nomeTime, nomeAluno, emailAluno;
        int matriculaAluno, qtdTimes,opcao, qtdeAlunos, x = 0, y = 0;
        double notaTime;
        
        System.out.println("Quantos times há nesta Hackaton? ");
        qtdTimes = in.nextInt();
        ListaTimesHackaton listaTimes = new ListaTimesHackaton(qtdTimes);
        
        do {
            System.out.println("Digite o nome do time: ");
            nomeTime = in.nextLine();
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
                    nomeAluno = in.nextLine();
                    System.out.println("Digite a matricula deste aluno: ");
                    matriculaAluno = in.nextInt();
                    System.out.println("Digite o email deste alunos: ");
                    emailAluno = in.nextLine();
                    emailAluno = in.nextLine();
                    Aluno aluno = new Aluno(nomeAluno, matriculaAluno, emailAluno);
        
                    if (time.addAluno(aluno) == true){
                        System.out.println("Aluno Adicionado");
                    } else {
                        System.out.println("Aluno não adicionado");
                    }
                    y++;
                } while (y < qtdeAlunos);
            } else {
              System.out.println("Quantidade de alunos inválida.");
            }
            listaTimes.addTime(time);
            x++;
        } while (x < qtdTimes);
        
        System.out.println(listaTimes.toString());
    }
    
    public static void menu(){
        System.out.println("Digite 1 para consultar o time vencedor");
        System.out.println("Digite 2 para exibir todos os participantes");
        System.out.println("Digite 3 para consultar times com a nota igual ou superior a 8.0");
        System.out.println("Digite 4 para pesquisar um time pelo nome");
        System.out.println("Digite 5 para sair do menu");
    }
}