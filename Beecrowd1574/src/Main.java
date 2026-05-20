import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testes = scan.nextInt();
        for (int i = 0; i < testes; i++){
            int posicao = 0;
            int instrucoes = scan.nextInt();
            int[] array = new int[instrucoes];
            for(int j = 0; j < instrucoes; j++) {
                String inst = scan.next();
                if (inst.equals("LEFT")) {
                    posicao -= 1;
                    array[j] = -1;
                } else if (inst.equals("RIGHT")) {
                    posicao += 1;
                    array[j] = +1;
                } else {
                    scan.next();
                    int numero = scan.nextInt();
                    posicao += array[numero - 1];
                    array[j] = array[numero - 1];
                }
            }
            System.out.println(posicao);
        }
    }
}