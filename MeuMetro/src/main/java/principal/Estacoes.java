package principal;
import java.util.ArrayList;
//Esta classe cria uma lista com as estacoes que são instâncias da classe Estacao.

public class Estacoes {
    
    final ArrayList<Estacao> lista;
    
    public void listarEstacoes(){
        for( Estacao info : lista){
            System.out.println(info);
        }
    }
    
    Estacoes(){
        lista = new ArrayList();
        
        Estacao e1 = new Estacao(1,"Estacao Eldorado","Rua Jequitibás, 530 - Eldorado",0);
        lista.add(e1);
        
        Estacao e2 = new Estacao(2,"Estacao Cidade Industrial","Rua Cláudia Neves, 85 - Camargos",120000);
        lista.add(e2);
        
        Estacao e3 = new Estacao(3,"Estacao Vila Oeste","Rua Maria José Assumpção, 61 - Vila Oeste",300000);
        lista.add(e3);
        
        Estacao e4 = new Estacao(4,"Estacao Gameleira","Rua Craveiro Lopes, 617 - Gameleira",480000);
        lista.add(e4);
        
        Estacao e5 = new Estacao(5,"Estacao Calafate","Rua Guaratã, 1.052 – Calafate",720000);
        lista.add(e5);
        
        Estacao e6 = new Estacao(6,"Estacao Carlos Prates","Av. Nossa Senhora de Fátima, 2.875 - Carlos Prates",840000);
        lista.add(e6);
        
        Estacao e7 = new Estacao(7,"Estacao Lagoinha","Av. do Contorno, 11.671, Centro",1020000);
        lista.add(e7);
        
        Estacao e8 = new Estacao(8,"Estacao Central","Praça Rui Barbosa, s/nº - Centro",1140000);
        lista.add(e8);
        
        Estacao e9 = new Estacao(9,"Estacao Santa Efigenia","Rua Conselheiro Rocha, 2.385 - Santa Efigênia",1320000);
        lista.add(e9);
        
        Estacao e10 = new Estacao(10,"Estacao Santa Tereza","Rua Mármore, 1.020 - Santa Tereza",1440000);
        lista.add(e10);
        
        Estacao e11 = new Estacao(11,"Estacao Horto","Rua Conselheiro Rocha, 4.050 – Horto",1560000);
        lista.add(e11);
        
        Estacao e12 = new Estacao(12,"Estação Santa Inês","Av. Contagem, 30 - Santa Inês",1680000);
        lista.add(e12);
        
        Estacao e13 = new Estacao(13,"Estação José Cândido da Silveira","Rua Gustavo Da Silveira, 2.000 - Bairro Santa Inês",1800000);
        lista.add(e13);
        
        Estacao e14 = new Estacao(14,"Estacao Minas Shopping","Rua Queluzita, 300 - Bairro São Paulo",1980000);
        lista.add(e14);
        
        Estacao e15 = new Estacao(15,"Estacao São Gabriel","Av. Cristiano Machado, 5.600 - Bairro São Paulo",2100000);
        lista.add(e15);
        
        Estacao e16 = new Estacao(16,"Estacao Primeiro de Maio","Avenida Cristiano Machado, 8.050 - Bairro Primeiro de Maio",2220000);
        lista.add(e16);
        
        Estacao e17 = new Estacao(17,"Estacao Waldomiro Lobo","Avenida Cristiano Machado, 9.542 - Bairro Minaslândia",2400000);
        lista.add(e17);
        
        Estacao e18 = new Estacao(18,"Estacao Floramar","Av. Cristiano Machado, nº. 10.411 – Floramar",2460000);
        lista.add(e18);
        
        Estacao e19 = new Estacao(19,"Estacao Vilarinho","Av. Vilarinho, nº 36 - Vila Clóris",2640000);
        lista.add(e19);
    }
}