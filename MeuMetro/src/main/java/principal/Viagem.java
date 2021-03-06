package principal;
import java.lang.Math;

public class Viagem{
    
    private Estacao origem;
    private Estacao destino;
    private long horaPartida;
    private long horaChegada; 
    private long tempoEstimado;
    private long tempoDecorrido;
    
    public Estacao getOrigem(){
        return origem;
    }

    public void setOrigem(Estacao origem){
        this.origem = origem;
    }

    public Estacao getDestino(){
        return destino;
    }

    public void setDestino(Estacao destino){
        this.destino = destino;
    }
    
    public long getHoraPartida(){
        return horaPartida;
    }

    public void setHoraPartida(long horaPartida){
        this.horaPartida = horaPartida;
    }
    
    public long getHoraChegada(){
        return horaChegada;
    }

    public void setHoraChegada(long horaChegada){
        this.horaChegada = horaChegada;
    }
    
    public long getTempoEstimado(){
        return tempoEstimado;
    }

    public void setTempoEstimado(long tempoEstimado){
        this.tempoEstimado = tempoEstimado;
    }
    
    public long getTempoDecorrido(){
        return tempoDecorrido;
    }

    public void setTempoDecorrido(long horaChegada){
        this.tempoDecorrido = horaChegada - this.getHoraPartida();
    }
    
    Viagem(Estacao origem, Estacao destino, long inicioViagem){
        setOrigem(origem);
        System.out.println("Estacao de Origem: " + origem);
        setDestino(destino);
        System.out.println("Estacao de Destino: " + destino);
        if(origem!=destino){
            setHoraPartida(inicioViagem);
            setTempoEstimado(Math.abs(destino.getTempo() - origem.getTempo()));
            System.out.println("Tempo estimado : " + getTempoEstimado()/60000 + " minutos.\nExecutando viagem com os dados informados. Aguarde...");
        }else{
            System.out.println("\nDados de origem e destino sao iguais. Viagem terminada.");
            System.exit(0);
        }
    }
}