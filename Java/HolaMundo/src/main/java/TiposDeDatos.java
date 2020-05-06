
public class TiposDeDatos {


    public static void main(String[] args) {
        
        
        //Boolean
        System.out.println("true tipo boolean"+Boolean.TRUE);
        System.out.println("false tipo boolean"+Boolean.FALSE);
        
        boolean booleanVar=true;
        
        if(booleanVar){
            System.out.println("el valor es verdadero");
        }
        else{
            System.out.println("El valor es falso");
        }
        
        var edad=10;
        var esAdulto=edad>=18;
        System.out.println("Es adulto ? = "+esAdulto);
        
        
        //char
        char varchar ='a';
        System.out.println("varchar = " + varchar);
        
        var varUnicode = '\u0021';
        System.out.println("varUnicode = " + varUnicode);
        char varcharDecimal=33;
        System.out.println("varcharDecimal = " + varcharDecimal);

        //byte,short,int,long       
        
        System.out.println("tamaño del char(bits) = " + Character.SIZE);
        System.out.println("tamaño del char(Bytes)= " + Character.BYTES);
        System.out.println("valor minimo del char= " + Character.MIN_VALUE);
        System.out.println("valor máximo del char = " + Character.MAX_VALUE);
               
        byte byteVar=15;
        System.out.println("byteVar = " + byteVar);
        System.out.println("tamaño del Byte(bits) = " + Byte.SIZE);
        System.out.println("tamaño del Byte(Bytes)= " + Byte.BYTES);
        System.out.println("valor minimo del Byte= " + Byte.MIN_VALUE);
        System.out.println("valor máximo del Byte = " + Byte.MAX_VALUE);
        
        short shortVar=15;
        System.out.println("shortVar = " + shortVar);
        System.out.println("tamaño del Short(bits) = " + Short.SIZE);
        System.out.println("tamaño del Short(Bytes)= " + Short.BYTES);
        System.out.println("valor minimo del Short= " + Short.MIN_VALUE);
        System.out.println("valor máximo del Short = " + Short.MAX_VALUE);
        
        int intVar=5000;
        System.out.println("intVar = " + intVar);
        System.out.println("tamaño del int(bits) = " + Integer.SIZE);
        System.out.println("tamaño del int(Bytes)= " + Integer.BYTES);
        System.out.println("valor minimo del int= " + Integer.MIN_VALUE);
        System.out.println("valor máximo del int = " + Integer.MAX_VALUE);
        
        long longVar=9223372036854775807L;
        System.out.println("longVar = " + longVar);
        System.out.println("tamaño del long(bits) = " + Long.SIZE);
        System.out.println("tamaño del long(Bytes)= " + Long.BYTES);
        System.out.println("valor minimo del long= " + Long.MIN_VALUE);
        System.out.println("valor máximo del long = " + Long.MAX_VALUE);
    
        
    }   
}