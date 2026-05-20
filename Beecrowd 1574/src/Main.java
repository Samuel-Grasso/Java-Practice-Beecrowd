import java.util.Scanner;
class Robot {
    private int posicao;
    private final int[] historico;
    private int passoatual;

    public Robot(int vezes) {
        this.posicao = 0;
        this.historico = new int[vezes];
        this.passoatual = 0;
    }

    public void Passos(String type, Scanner scan) {
        if (type.equals("LEFT")) {
            posicao -= 1;
            historico[passoatual] = -1;
        } else if (type.equals("RIGHT")) {
            posicao += 1;
            historico[passoatual] = 1;
        } else if (type.equals("SAME")) {
            scan.next();
            int index = scan.nextInt();

            int pastMove = historico[index - 1];
            posicao += pastMove;
            historico[passoatual] = pastMove;
        }
        passoatual++;
    }

    public int getPosicao() {
        return this.posicao;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNextInt()) return;
        int testes = scan.nextInt();

        for (int i = 0; i < testes; i++) {
            int vezes = scan.nextInt();

            Robot robot = new Robot(vezes);

            for (int j = 0; j < vezes; j++) {
                String inst = scan.next();
                robot.Passos(inst, scan);
            }

            System.out.println(robot.getPosicao());
        }

        scan.close();
    }
}