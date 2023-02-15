package POO_aula;

public class Exemplo03_Pessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas",18);
        Pessoa p2 = new Pessoa("Emerson",25);

        
        
        /* 
        p1.nome ="Emerson";
        p1.idade = 18;
        p2.nome ="Carina";
        p2.idade = 25;*/
       //System.out.println(p1);
        //System.out.println(p2.nome);

        p1.apresentar();
        p2.apresentar();
        
    }
}
