import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int numero = scan.nextInt();
            int soma = 0;
            for (int j = 1; j <= numero / 2; j++) {
                if(numero % j == 0){
                    soma += j;
                }
            }
            if (soma == numero) System.out.println(numero + " eh perfeito");
            else System.out.println(numero + " nao eh perfeito");
        }
    }
}