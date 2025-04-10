import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if(num > 10){
            System.out.println("Número maior do que 10");
        }else{
            System.out.println("Número menor ou igual do que 10");
        }

        sc.close();
    }
}
