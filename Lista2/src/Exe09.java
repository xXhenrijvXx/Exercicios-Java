import java.util.Random;

public class Exe09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet1 = new int[5];
        int[] vet2 = new int[vet1.length];
        int[] vet3 = new int[vet1.length];

        for(int i = 0; i < vet1.length; i++){
            vet1[i] = random.nextInt(0, 100);
            vet2[i] = random.nextInt(0, 100);
        }

        for (int i = 0; i < vet1.length; i++){
            if(i % 2 == 0){
                vet3[i] = vet1[i];
            }else{
                vet3[i] = vet2[i];
            }
            System.out.println(vet3[i]);
        }

    }
}
