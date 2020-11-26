package principal;

final public class Usuario {
    
    private String nomeUsuario;
    private int senhaUsuario;
    
    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    public int getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(int senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
    void cadastrarUsuario(String nome, int senha){
            if(this.getNomeUsuario().equals("Convidado")){
                this.setNomeUsuario(nome);
                this.setSenhaUsuario(senha);
                System.out.println("Usuario " + this.getNomeUsuario() + " cadastrado com sucesso.");
                this.logar(nome, senha);
            }else{
                System.out.println("Ja existe um usuario cadastrado. Encerrando programa.");
                System.exit(0);
            }
            
    }
    
    void logar(String nome, int senha){
        boolean acessoNome = nome.equals(this.getNomeUsuario());
        boolean acessoSenha = (senha==this.getSenhaUsuario());
        if(acessoNome && acessoSenha){
            System.out.println("Usuario " + this.getNomeUsuario() + " logado com sucesso.");
        } else {
            System.out.println("Dados de acesso incorretos.\nEncerrando programa.");
            System.exit(0);
        }
    }
    
    Usuario(){
        this.setNomeUsuario("Convidado");
        this.setSenhaUsuario(0);
    }
    
    Usuario(int i, String nome, int senha){
        if(i==1){
            this.logar(nome, senha);
        }else if(i==2){
            this.cadastrarUsuario(nome, senha);
        }
    }
}