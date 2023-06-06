
/**
 * Você recebeu um problema inicialmente resolvido, 
 * porém você precisa entender o problema e dar continuidade
 * à solução...
 * Operacoes
 * 1) Inserir um convidado (nome) na lista
 * 2) Escrever a lista de convidados numerada
 * 3) Excluir um convidado da lista
 * 4) Verificar se um nome está na lista
 * 5) Editar um nome da lista
 * 6) Redefinir a quantidade de convidados da lista
 * 7) Ordenar a lista (ordem alfabetica)
 */
import java.util.ArrayList;
import java.util.Collections;

public class ListaConvidados
{
    private ArrayList<String> lista = new ArrayList(); //Cria um novo Array
    int capacidade = 5;
    
    public ListaConvidados(int quantidade){ //Determina a capacidade incial da lista (5)
        if(quantidade<5){
            lista.ensureCapacity(5);
            lista.add(0, null);
        }
    }
    
    public boolean inserir(String nome){ //Insere um elemento na lista
        lista.add(nome);
        return true;
    }
    
    
    public boolean printar(){ //Exibe na todos os elementos presentes no Array junto de seus índices
        if(lista.size() == 0){
            System.out.println("A lista está vazia");
            return false;
        }
        for(int i = 0; i < lista.size(); i++){
            System.out.println(i + " " + lista.get(i));
        }
        return true;
    }
    
    public boolean remover(String nome){ //Recebe o nome do elemento e remove ele do Array
        if(lista.indexOf(nome) == -1){
            System.out.println("Convidado não encontrado.");
        } else{
            lista.remove(nome);
            System.out.println("Convidado removido com sucesso.");
        }   return true;
    }
    
    public boolean verificar(String nome){ //Recebe o nome do elemento e verifica se ele está presente na lista
        if(lista.indexOf(nome) == -1){
            System.out.println("Convidado não encontrado.");
        } else{
                System.out.println("Convidado encontrado.");
        } return true;
    }
    
    public boolean editar(String nome, String nome2){ //Recebe o nome do elemento que precisa ser editado, e recebe um novo nome par ao elemento.
        lista.set(lista.indexOf(nome), nome2);
        System.out.println("Convidado editado com sucesso");
        return true;
    }
    
    public boolean ordenar(){ //Ordena em ordem alfabética a lista
        Collections.sort(lista);
        return true;
    }
    
    public boolean editarTam(int tam){ //Altera o tamanho do Array
        if(tam < 5){
            System.out.println("A lista deve ter no mínimo 5 convidados.");
            return false;
        } else{
            lista.ensureCapacity(tam);
            capacidade = tam;
            return true;
        }
    }
    
    public int getTam(){
        return capacidade;
    } //Retorna para o app a capacidade atual da lista
}
