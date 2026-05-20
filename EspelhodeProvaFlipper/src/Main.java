import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int r = scan.nextInt();
        if (p == 0){
            System.out.println("C");
        }
        else if (r == 0 && p == 1){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }

    }
}