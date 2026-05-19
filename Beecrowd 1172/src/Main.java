import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++){
            int num = scan.nextInt();
            if (num <= 0){
                numeros[i] = 1;
            }
            else{
                numeros[i] = num;
            }
            System.out.printf("X[%d] = %d\n", i, numeros[i]);
        }
    }
}