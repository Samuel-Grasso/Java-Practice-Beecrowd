import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int ab = (a + b + abs(a -b))/ 2;
        int abc = (ab + c + abs(ab -c))/ 2;
        System.out.printf("%d eh o maior\n", abc);
    }
}