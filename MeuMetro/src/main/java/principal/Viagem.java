package principal;
import java.util.Date;

public class Viagem {
    
    private int idViagem;

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    private int origem;
        
    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    private int destino;
        
    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    private Date horaPartida;
    
    public Date getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(Date horaPartida) {
        this.horaPartida = horaPartida;
    }
    
    private Date horaChegada;
    
    public Date getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Date horaChegada) {
        this.horaChegada = horaChegada;
    }
    
    private Date tempoEstimado;
    
    public Date getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(Date tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }
    
    private Date tempoDecorrido;

    public Date getTempoDecorrido() {
        return tempoDecorrido;
    }

    public void setTempoDecorrido(Date tempoDecorrido) {
        this.tempoDecorrido = tempoDecorrido;
    }
    
    void localizarTrem(){
        //
    }
    
    void finalizarViagem(){
        //
    }
    
    Viagem(int id, int origem, int Destino){
        finalizarViagem();
        setIdViagem(id);
        setOrigem(origem);
        setDestino(destino);
    }
    
    
   
}
