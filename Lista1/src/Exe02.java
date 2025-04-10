import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var soma = sc.nextInt();
        System.out.println("Digite outro: ");
        soma += sc.nextInt();

        System.out.printf("Soma: %d", soma);

        sc.close();
    }
}
