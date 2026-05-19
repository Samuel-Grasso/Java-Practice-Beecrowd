import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++){
            numeros[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.printf("N[%d] = %d\n", count, numeros[i]);
            count += 1;
        }
    }
}