import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tweet = scan.nextLine();
        if (tweet.length() > 140) {
            System.out.println("MUTE");
        }
        else {
            System.out.println("TWEET");
        }
    }
}