
public class OtrosOperadores {

    public static void main(String[] args) {
       
        //operador ternario
        
        var resultado= (7>2)?"verdadero":false;
        System.out.println("resultado ternario= " + resultado);
        var numero=7;
        var par =(numero%2==0)?"numero par":"numero impar";
        System.out.println("es par ? = " + par);
        System.out.println("OPERADORES UNARIOS");
       boolean c= true;
       boolean d= !c;
        System.out.println("d = " + d);
        
       //incremento
       //preincremento
       int e=3;
       int f=++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
       //postincremento
       //incrementa hasta la siguiente vez que se vuelve a encontrar
       int g=5;
       int h= g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        System.out.println("OPERADORES DE IGUALDAD O RELACIONALES"); 
        
        String cadena="hola";
        System.out.println(cadena.equals("hola"));
    }
}