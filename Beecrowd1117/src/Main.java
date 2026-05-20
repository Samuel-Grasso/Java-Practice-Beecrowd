import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        ArrayList<Double> lista = new ArrayList<>();
        while (lista.size() != 2) {
            double nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                lista.add(nota);
            }
            else{
                System.out.println("nota invalida");
            }
        }
        double media = (lista.get(0) + lista.get(1)) / 2;
        System.out.printf(Locale.US, "media = %.2f%n", media);
    }
}