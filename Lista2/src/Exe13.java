import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int[] vet = new int[sc.nextInt()];

        for(int i = 0; i < vet.length; i++){
            if(i == 0 || i == 1){
                vet[i] = 1;
            }else{
                vet[i] = vet[i-1] + vet[i-2];
            }
            System.out.printf("%d | ", vet[i]);
        }
    }
}
