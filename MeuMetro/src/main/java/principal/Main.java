package principal;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Estacoes bh = new Estacoes();
        long inicioViagem, fimViagem;
        String nome;
        int opt1, opt2;
        
        System.out.println("MEU METRÔ");
        System.out.println("Digite um nome de usuario para salvar seu histórico de viagens.");
        nome = leia.nextLine();
        Usuario user = new Usuario(nome);
        
        System.out.println("\nCarregando lista de estações. Aguarde...");
        try{
            Thread.sleep(6000);
            System.out.println("======================================");
        }catch(Exception e){
            System.out.println("======================================");
        }
        bh.listarEstacoes();
        System.out.println("======================================");
        System.out.println("Digite o número da estação de Origem: ");
        opt1 = leia.nextInt();
        System.out.println("Digite o número da estação de Destino: ");
        opt2 = leia.nextInt();
        
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
        inicioViagem = System.currentTimeMillis();
        String dataFormatada = formatar.format(inicioViagem);
        System.out.println("Iniciando nova viagem: " + dataFormatada);

        Estacao origem = new Estacao();
        Estacao destino = new Estacao();
        origem = bh.lista.get(opt1-1);
        destino = bh.lista.get(opt2-1);
        Viagem viagem = new Viagem(origem, destino, inicioViagem);
        
        for(int n = 3; n>=0; n--){
            try{
                System.out.print(".");
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.print(".");
            }
        }
        
        fimViagem = System.currentTimeMillis();
        viagem.setHoraChegada(fimViagem);
        viagem.setTempoDecorrido(fimViagem);
        dataFormatada = formatar.format(fimViagem);
        System.out.println("\nViagem encerrada. Hora Fim: " + dataFormatada);
                
        System.out.println("\nTempo decorrido: " + viagem.getTempoDecorrido()/1000 + " segundos (versao de teste)."
                + "\nSalvando dados de viagens para o usuario " + user.getNomeUsuario());
        //System.out.println("Viagem salva no historico de " + user.getNomeUsuario() + ".");
    }
}