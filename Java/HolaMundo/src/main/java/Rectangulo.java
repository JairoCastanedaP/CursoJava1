
import java.util.Scanner;


public class Rectangulo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporcione el alto");
        int alto=Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporcione el ancho");
        int ancho=Integer.parseInt(scanner.nextLine());
        
        var area=alto*ancho;
        var perimetro=(alto+ancho)*2;
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        
    }
}
