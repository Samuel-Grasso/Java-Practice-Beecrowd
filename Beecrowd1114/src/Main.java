import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha = 2002;
        int atual = scan.nextInt();
        while(true){
            if(senha == atual){
                System.out.println("Acesso Permitido");
                break;

            }
            else{
                System.out.println("Senha Invalida");
                atual = scan.nextInt();
            }
        }
    }
}