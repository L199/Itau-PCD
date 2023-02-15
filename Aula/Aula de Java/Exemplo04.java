public class Exemplo04 {
    public static void main(String[] args) {
        int pontos =10;
        int chaves=2;
        boolean a1,a2;

        a1=(pontos>=100)&&(chaves>0);
        a2=(pontos>1000)&&(chaves>2);


        if(a1==true){
            System.out.println("A porta 1 aberta");
        }
        if(a2==false){
            System.out.println("A porta 2 aberta");
        }
    }
}
