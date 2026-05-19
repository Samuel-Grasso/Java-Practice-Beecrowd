import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numeros = new double[10];
        int num = scan.nextInt();
        for (int i = 0; i < 10; i++){
            double atual = num * Math.pow(2, i);
            numeros[i] = atual;
            System.out.printf("N[%d] = %.0f\n", i, numeros[i]);
        }
    }
}