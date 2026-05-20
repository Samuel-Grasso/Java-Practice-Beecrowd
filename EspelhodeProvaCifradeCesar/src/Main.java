import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for (int i = 1; i <= casos; i++) {
            String codigo = scan.next();
            int deslocamento = scan.nextInt();
            for (int j = 0; j < codigo.length(); j++) {
                char letra = codigo.charAt(j);

                int novaletra = letra - deslocamento;
                if (novaletra < 'A'){
                    novaletra = novaletra + 26;
                }
                System.out.print((char)novaletra);
            }
            System.out.println();

        }
    }
}