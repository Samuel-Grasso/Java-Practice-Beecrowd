import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int npipes = scan.nextInt();
        int[] pipes = new int[npipes];
        String win = "YOU WIN";
        pipes[0] = scan.nextInt();
        for (int i = 1; i < npipes; i++) {
            pipes[i] = scan.nextInt();
            if (Math.abs(pipes[i] - pipes[i-1]) > height){
                win  = "GAME OVER";
            }
        }
        System.out.println(win);
    }
}