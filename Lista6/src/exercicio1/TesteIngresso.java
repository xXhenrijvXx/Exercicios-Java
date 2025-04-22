package exercicio1;

public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(5.40);
        Ingresso i2 = new IngressoVIP(5.40, 2.5);

        System.out.println(i1.toString());
        System.out.println(i2.toString());
    }
}
