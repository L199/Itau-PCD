package POO_exericicios;

public class Exericio03_Veiculo {
    public static void main(String[] args) {

        Veiculo v = new Veiculo("BMW", "X1", 7.5);

        v.exibir();
        // v.consumo= 7.0;
        //.alterarConsumo(6);
        v.setConsumo(6);

        System.out.println("Consumo: " + v.getConsumo());

    }

}
