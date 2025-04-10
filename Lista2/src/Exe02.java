import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int[] vetor = new int[sc.nextInt()];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for(int num : vetor){
            if(num > 0){
                System.out.println(num + " é maior que 0");
            }else if(num < 0){
                System.out.println(num + " é menor que 0");
            }else{
                System.out.println(num + " é igual a 0");
            }
        }
    }
}
