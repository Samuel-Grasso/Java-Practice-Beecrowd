import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int distance = scan.nextInt();
        double fuel = scan.nextDouble();
        double consumption = distance / fuel;
        System.out.printf(java.util.Locale.US,"%.3f km/l\n", consumption);
    }
}