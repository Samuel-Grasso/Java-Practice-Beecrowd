import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numeros = scan.nextLine();
        ArrayList<Integer> lista = new ArrayList<>();
        String[] partes = numeros.split(" ");
        for(String parte : partes){
            lista.add(Integer.parseInt(parte));
        }
        lista.sort(null);
        System.out.println(abs((lista.get(0) - lista.get(lista.size()-1))));
    }
}