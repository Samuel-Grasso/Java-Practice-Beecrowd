import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break;

            if (x1 == x2 && y1 == y2) {
                System.out.println("0");
            }
            else if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }
        }
    }
}