import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vet1.length; i++){
            System.out.println("Digite um número: ");
            vet1[i] = sc.nextInt();
        }

        for(int i = 0; i < vet1.length; i++){
            vet2[i] = 2 * vet1[i];
            System.out.println(vet2[i]);
        }
    }
}
