
public class HolaMundo {   
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");
        var despedirse= "hola";
        System.out.println(despedirse);
        
        var numero=1;
        var i=1;
        var j=2;
        System.out.println(numero);
        
        System.out.println("concatenar :\n"+ despedirse+" + "+numero);
        System.out.println("concatenar :\t"+ despedirse+" + "+numero);
        System.out.println("concatenar :\b\b\b"+ despedirse+" + "+numero);
        System.out.println(despedirse+i+j);//concatea  por encontrar primero cadenas
        System.out.println(i+j+despedirse);// primero suma por encontrar primero numeros
    }
}
