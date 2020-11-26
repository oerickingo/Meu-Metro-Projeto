package principal;

class Estacao{
    private int id;
    private String nome;
    private String endereco;
    private long tempo;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTempo() {
        return tempo;
    }

    public void setTempo(long tempo) {
        this.tempo = tempo;
    }
    
    Estacao(){
    }
    
    Estacao(int id, String nome, String endereco, long tempo){
        this.setId(id);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTempo(tempo);
    }
    
    @Override
    public String toString(){
      return " " + id + " : " + nome;
    }
}