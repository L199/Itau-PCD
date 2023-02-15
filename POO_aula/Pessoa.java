package POO_aula;

public class Pessoa {
   public String nome;
   public int idade;

   public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}

   public void apresentar(){
        System.out.println("Olá! Eu sou o(a)"+this.nome);
        System.out.println("Tenho "+this.idade);

    }

    
}
