
public class Operadores {

    public static void main(String[] args) {
        
        float a=3,b=2;
        float resultado = a+b;
        System.out.println("resultado = " + resultado);
        System.out.println("resultado = "+(a+b));
        
        float resultado2=a/b;
        System.out.println("division = "+resultado2);
        
        var par= a%b;
        if(par==0){
            System.out.println("es par");
        }
        else{
            System.out.println("no es par");
        }
        
    }
}
