import java.util.Random;

public class Exe14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[5];
        int maior = 0, indice = 0;

        for(int i = 0; i < vet.length; i++){
            vet[i] = random.nextInt(0, 10);
            System.out.printf("%d |", vet[i]);
        }
        System.out.printf("\n");
        for(int i = 0; i < vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
                indice = i;
            }
        }

        for(int i = indice; i < (vet.length - indice - 1); i++){
            vet[i] = vet[i+1];
        }
        vet[vet.length - 1] = maior;

        for(int num : vet){
            System.out.printf("%d |", num);
        }
    }
}
