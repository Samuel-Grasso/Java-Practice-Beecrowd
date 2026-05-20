import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int maior = 0;
        int posicao = 0;
        for ( int i = 0; i < 100; i++ ) {
            list.add(scan.nextInt());
            if (list.get(i) > maior) {
                maior = list.get(i);
                posicao = i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}