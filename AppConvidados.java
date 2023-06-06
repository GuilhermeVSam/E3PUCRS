
/**
 * Escreva uma descrição da classe AppConvidados aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class AppConvidados
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int resposta;
        int nConvidados = 0;
        String buffer;
        
        ListaConvidados convidados = new ListaConvidados(5);
        
        do{
            System.out.println("Digite 1 para Inserir um convidado na lista.");
            System.out.println("Digite 2 para Exibir a lista de convidados.");
            System.out.println("Digite 3 para Excluir um convidado da lista.");
            System.out.println("Digite 4 para Verificar se um convidado consta na lista.");
            System.out.println("Digite 5 para Editar um nome da lista.");
            System.out.println("Digite 6 para Redefinir a quantidade de convidados na lista.");
            System.out.println("Digite 7 para Organizar a lista em ordem alfabética.");
            System.out.println("Digite 0 para sair.");
            resposta = in.nextInt();
            
            switch(resposta){
                case 1:
                    buffer = in.nextLine();
                    int capacidade = convidados.getTam();
                    if(capacidade == nConvidados){
                        System.out.println("A lista de convidados está cheia, remova convidados ou aumente o tamanho da lista e tente novamente.");
                    } else{
                            for(int i = 0; i < capacidade; i++){
                            System.out.println("Insira o nome do convidado: ");
                            convidados.inserir(in.nextLine());
                            nConvidados++;
                        }
                    }
                    break;
                    
                case 2:
                    convidados.printar();
                    break;
                    
                case 3:
                    System.out.println("Insira o nome do convidado: ");
                    buffer = in.nextLine();
                    convidados.remover(in.nextLine());
                    nConvidados--;
                    break;
                    
                case 4:
                    System.out.println("Insira o nome do convidado: ");
                    buffer = in.nextLine();
                    convidados.verificar(in.nextLine());
                    break;
                    
                case 5:
                    System.out.println("Insira o nome do convidado que deseja editar: ");
                    buffer = in.nextLine();
                    String convidadoE = in.nextLine();
                    
                    System.out.println("Insira um novo nome para o convidado: ");
                    String convidadoN = in.nextLine();
                    
                    convidados.editar(convidadoE, convidadoN);
                    break;
                    
                case 6:
                    System.out.println("Insira uma nova capacidade para a lista: ");
                    convidados.editarTam(in.nextInt());
                    break;
                    
                case 7:
                    convidados.ordenar();
                    break;
                    
                case 0:
                    System.out.println("Você escolheu sair...");
                    
            }
        } while(resposta != 0);
    }
}

