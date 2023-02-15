package POO_exericicios;

public class Exercicio04_Relogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(8,12,30);

        Relogio relogio1 = new Relogio(9,12,30);
    

        /* 
        relogio.setHora(9);
        relogio.setMinuto(25);
        relogio.setSegundo(59);*/
        System.out.println("Hora: "+relogio.getHora());
        System.out.println("Minuto: "+relogio.getMinuto());
        System.out.println("Hora: "+relogio.getSegundo());
        
        System.out.println("---");
        relogio.exibir();
        relogio1.exibir();
    
}
}
