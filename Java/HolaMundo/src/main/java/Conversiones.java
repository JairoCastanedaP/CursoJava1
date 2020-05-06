
import java.util.Scanner;


public class Conversiones {
    public static void main(String[] args) {
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double valorPI =Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        char c= "hola".charAt(0);
        System.out.println("c = " + c);
        
        var enter = new Scanner(System.in);
        edad = Integer.parseInt(enter.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter = enter.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
                
                //ENTERO A STRING
                
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
        
        //booleano a String
        String booleanTexto = String.valueOf(25);
        System.out.println("booleanTexto = " + booleanTexto);
        
        short s=129;
        byte b= (byte) s;
        System.out.println("b = " + b);
    }   
}