/**
 * Escreva uma descrição da classe TimesHackaton aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListaTimesHackaton{
    private Time [] lista;
    private int proximoIndice, tamanho = 15;
    
    public ListaTimesHackaton(){
        lista = new Time[tamanho];
        proximoIndice = 0;
    }
    
    public boolean addTime(Time time){
        if(proximoIndice == 0){
            lista[0] = time;
            proximoIndice++;
            return true;
        } else {
            return false;
        }
    }

    public Time buscaTimeVencedor(){
        Time vencedor = lista[0];
        int maior = 0;
        if (proximoIndice==0){
            return null;
        } else {
            for(int i=0;i<proximoIndice;i++){
                if(lista[i].getNota() > maior){
                    vencedor =  lista[i];
                }
            }
            return vencedor;
        }
    }

    public String getParticipantes(){
        String saida = "A lista completa de participantes é: /n";
        for (int i = 0; i < tamanho; i++){
            saida = saida + lista[i].exibeTodosAlunos();
        }
        return saida;
    }
    
    public String toString(){
        String saida = "";
        for(int i = 0; i < proximoIndice; i++){
            if(lista[i]!= null)
                saida = saida +"\n-------------------\n"+ lista[i].toString();
        }
        return saida;
    }
}
