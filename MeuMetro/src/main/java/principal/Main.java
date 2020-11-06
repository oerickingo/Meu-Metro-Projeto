package principal;
import java.util.Date;


public class Main {
    public static void main(String[] args){
        
        
        System.out.println("Meu Metro!");
        int id;
        int origem;
        int destino;
        
        System.out.println("Iniciando nova viagem: ");
        id = 1;
        System.out.println("Selecione local de partida: ");
        origem = 2;
        System.out.println("Selecione local de destino: ");
        destino = 3;
        
        Viagem v1 = new Viagem(id, origem, destino);
        
        
        
    }
}