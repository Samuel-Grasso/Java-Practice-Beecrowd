import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = n * i;
            System.out.printf("%d x %d = %d\n", i , n, mult);
        }
    }
}