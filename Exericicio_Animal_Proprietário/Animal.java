package Exericicio_Animal_Proprietário;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietário proprietario;

    public Animal(String nomeAnimal, String raca, int anoNascimento, String nomeProprietario, String telefone) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietário(nomeProprietario, telefone);
    }

    public Animal(String nomeAnimal, String raca, int anoNascimento, Proprietário proprietario) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    // public void trocaTelefoneProprietario(String novoTelefone) {
    //     proprietario.setTelefone(novoTelefone);
    // }

    public Proprietário getProprietario() {
        return proprietario;
    }

    public String getDados() {
        return "Animal: " + nome + " raça: " + raca + " nascimento: " + anoNascimento + "\n" + proprietario.getDados();
    }

   



}
