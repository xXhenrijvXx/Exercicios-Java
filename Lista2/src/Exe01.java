import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        double media = (double) soma / vetor.length;
        System.out.println("Média: " + media);

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < media){
                System.out.println(vetor[i] + " é menor que a média");
            }else if(vetor[i] == media){
                System.out.println(vetor[i] + " é igual a média");
            }else{
                System.out.println(vetor[i] + " é maior que a média");
            }
        }

    }
}
