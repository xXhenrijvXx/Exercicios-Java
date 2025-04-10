import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, conta;

        System.out.println("Digite um número: ");
        num1 = sc.nextInt();
        System.out.println("Digite outro: ");
        num2 = sc.nextInt();

        conta = num1 + num2;
        System.out.println("Soma: " + conta);
        conta = num1 - num2;
        System.out.println("Subtração: " + conta);
        conta = num1 * num2;
        System.out.println("Multiplicação: " + conta);
        double div = (double) num1 / num2;
        System.out.println("Divisão: " + div);

        sc.close();
    }
}
