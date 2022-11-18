/**
 * Escreva uma descrição da classe TimesHackaton aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListaTimesHackaton{
    private Time [] lista;
    private int proximoIndice, tamanho;
    
    public ListaTimesHackaton(int tamanho){
        lista = new Time[tamanho];
        proximoIndice = 0;
        this.tamanho = tamanho;
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

    public String getParticipantes(){
        String saida = "";
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
