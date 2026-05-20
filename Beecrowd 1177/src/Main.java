import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] vector = new int[1000];
        for(int i = 0; i < 1000; i+=n){
            for(int j = 0; j < n; j++){
                if (i + j <1000) vector[i+j] = j;
                else break;
                System.out.printf("N[%d] = %d\n", i+j, vector[i+j]);
            }
        }
    }
}