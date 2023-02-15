package Exericicio_Animal_Proprietário;

public class Proprietário {
    private String nome, telefone;

    public Proprietário(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getDados() {
        return nome + ", " + telefone;
    }

    public void setTelefone(String novoTelefone) {
        telefone = novoTelefone;
    }
    

}
