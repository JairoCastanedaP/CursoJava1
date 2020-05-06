
import java.util.Scanner;


public class TiendaLibros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre");
        String nombre= scanner.nextLine();
        
        System.out.println("Proporciona el id");
        int id= Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporciona el precio");
        double precio= Double.parseDouble(scanner.nextLine());
        
        System.out.println("Proporciona el envío gratuito");
        char envioGratuitoAux= scanner.nextLine().charAt(0);
        
        boolean envioGratuito=envioGratuitoAux=='t';
        //boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(nombre+"#"+id);
        System.out.println("Precio =  "+" $" + precio);
        System.out.println("envioGratuito = " + envioGratuito);
    }
}
