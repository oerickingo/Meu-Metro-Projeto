package principal;
import java.util.Date;

public class BotaoPanico {
    int idUsuario;
    int idLocalizacao;
    Date horarioAcionamento;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(int idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Date getHorarioAcionamento() {
        return horarioAcionamento;
    }

    public void setHorarioAcionamento(Date horarioAcionamento) {
        this.horarioAcionamento = horarioAcionamento;
    }
    
    void acionarPanico(){
        //
    }
    
    void enviarAlerta(){
        //
    }
    
}
