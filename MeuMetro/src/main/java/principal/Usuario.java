package principal;
final public class Usuario {
    
    private String nomeUsuario;
    
    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    void cadastrarUsuario(String nome){
        this.setNomeUsuario(nome);
        System.out.println("Usuario " + this.getNomeUsuario() + " cadastrado com sucesso.");
        this.logar(nome);
    }
    
    void logar(String nome){
        boolean acesso = true;
        if(acesso){
            System.out.println("Usuario " + this.getNomeUsuario() + " logado.");
        } else {
            System.out.println("Dados de acesso incorretos.\nFinalizando programa.");
            System.exit(0);
        }
    }
    
    Usuario(String nome){
        this.cadastrarUsuario(nome);
    }
}