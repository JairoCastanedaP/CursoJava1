
import java.util.Scanner;

public class HolaScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        var titulo= input.nextLine();
        System.out.println("Ingrese el autor del libro");
        var autor=input.nextLine();
        System.out.println("<"+titulo+"> "+"fue escrito por"+" <"+autor+">");
    }
}
