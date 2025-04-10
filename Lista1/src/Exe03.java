import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Digite um número: ");
            num1 = sc.nextInt();
            System.out.println("Digite outro distinto: ");
            num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            } else if (num2 > num1) {
                System.out.println(num2 + " é maior que " + num1);
            } else {
                System.out.println("Números inválidos, digite valores distintos");
            }
        }while(num1 == num2);

        sc.close();
    }
}
