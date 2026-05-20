import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] lista = new int[size];
        lista[0] = scan.nextInt();
        int menor = lista[0];
        int index = 0;
        for (int i = 1; i < size; i++) {
            lista[i] = scan.nextInt();
            if (lista[i] < menor) {
                menor = lista[i];
                index = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + index);
    }
}