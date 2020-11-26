package principal;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Estacoes bh = new Estacoes();
        
        
        int opt1, opt2, opt3, senha, novaSenha;
        String nome, novoNome;
    
        System.out.println("MEU METRÔ");
        System.out.println("(1)Efetuar Login\n(2)Novo Usuario\n Digite 1 ou 2:");
        opt1 = leia.nextInt();
        if(opt1==1){
            System.out.println("- Digite o nome de Usuario:");
            nome = leia.next();
            System.out.println("- Digite o numero da Senha:");
            senha = leia.nextInt();
            Usuario n1 = new Usuario(opt1, nome, senha);
        }else if(opt1==2){
            System.out.println("- Digite o nome do novo Usuario:");
            novoNome = leia.next();
            System.out.println("- Digite o numero da nova Senha:");
            novaSenha = leia.nextInt();
            Usuario n1 = new Usuario(opt1, novoNome, novaSenha);
        }else{
            System.out.println("Opcao Invalida. Encerrando programa.");
            System.exit(0);
        }
        
        System.out.println("============================================================");
        System.out.println("Configurando sua nova viagem. Listando estações:");
        bh.listarEstacoes();
        System.out.println("Digite o número da estação de Origem: ");
        opt2 = leia.nextInt();
        System.out.println("Digite o número da estação de Destino: ");
        opt3 = leia.nextInt();
        System.out.println("Iniciando nova viagem...");
        
        
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
        long inicioViagem = System.currentTimeMillis();
        String dataFormatada = formatar.format(inicioViagem);
        System.out.println("Hora Inicio: " + dataFormatada);
        
        Estacao origem = new Estacao();
        Estacao destino = new Estacao();
        origem = bh.lista.get(opt2-1);
        destino = bh.lista.get(opt3-1);
        
        
        Viagem viagem = new Viagem(origem, destino, inicioViagem);
        
        
        System.out.println("Viagem iniciada.");
        System.out.println("Tempo estimado: " + formatar.format(viagem.getTempoEstimado()));
        System.out.println("Aguarde o encerramento da viagem:");
                
        try{
          Thread.sleep(8000);
          System.out.println("Viagem finalizada com sucesso.");
        }catch(Exception e){
          System.out.println("Encerrando viagem.");
        }
        
        viagem.setTempoDecorrido(viagem.getHoraPartida() + viagem.getTempoEstimado());
        
        System.out.println("Tempo decorrido: " + viagem.getTempoDecorrido());
        System.out.println("Obrigado!");
        
        
        
        
    }
}