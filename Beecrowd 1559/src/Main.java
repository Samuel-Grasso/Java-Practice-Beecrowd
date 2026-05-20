import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) return;

        int cases = scan.nextInt();

        for (int z = 0; z < cases; z++) {
            int[][] matrix = new int[4][4];
            TreeSet<String> moves = new TreeSet<>();
            boolean has2048 = false;

            // Step 1: Fill matrix and check for 2048
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = scan.nextInt();
                    if (matrix[i][j] == 2048) {
                        has2048 = true;
                    }
                }
            }

            // Step 2: Only check for moves if 2048 was NOT found
            if (!has2048) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (matrix[i][j] != 0) {
                            // Check LEFT
                            if (j > 0 && (matrix[i][j - 1] == 0 || matrix[i][j - 1] == matrix[i][j]))
                                moves.add("LEFT");
                            // Check RIGHT
                            if (j < 3 && (matrix[i][j + 1] == 0 || matrix[i][j + 1] == matrix[i][j]))
                                moves.add("RIGHT");
                            // Check UP
                            if (i > 0 && (matrix[i - 1][j] == 0 || matrix[i - 1][j] == matrix[i][j]))
                                moves.add("UP");
                            // Check DOWN
                            if (i < 3 && (matrix[i + 1][j] == 0 || matrix[i + 1][j] == matrix[i][j]))
                                moves.add("DOWN");
                        }
                    }
                }
            }

            // Step 3: Output result
            if (moves.isEmpty()) {
                System.out.println("NONE");
            } else {
                System.out.println(String.join(" ", moves));
            }
        }
        scan.close();
    }
}