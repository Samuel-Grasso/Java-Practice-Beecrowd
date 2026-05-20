import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testes = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < testes; i++) {
            String linha1 = scan.nextLine();
            String linha2 = scan.nextLine();
            int max = Math.max(linha1.length(), linha2.length());
            for (int j = 0; j < max; j += 2) {

                // Get 2 from String 1 (if they exist)
                if (j < linha1.length()) System.out.print(linha1.charAt(j));
                if (j + 1 < linha1.length()) System.out.print(linha1.charAt(j + 1));

                // Get 2 from String 2 (if they exist)
                if (j < linha2.length()) System.out.print(linha2.charAt(j));
                if (j + 1 < linha2.length()) System.out.print(linha2.charAt(j + 1));
            }
            System.out.println();
        }
    }
}