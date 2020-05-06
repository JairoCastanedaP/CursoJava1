fun main(args: Array<String>){
    println("Hola mundo kotlin");

    var edad:Int=28;
    var nombre:String="jairo";
    var apellido="Castañeda";
    val constante=2323;

    println(nombre+" "+apellido);
    println("my name is $nombre and my lastname is $apellido");

    //leer por consola
    /*println("proporcione el nombre");
    var aux= readLine();
    println("el nombre es $aux");
*/
    //listas
    var nombres= listOf("pepe","luisa");
    println("tamaño de la lista: "+nombres.size);

    //arreglos modificables
    var nombres2= mutableListOf("pc","mouse");
    nombres2.add("keyboard");
    println("tamaño arreglo"+nombres2.size);

    for(nombre in nombres2){
        println(nombre);
    }
    fun imprimir(limite: Int){
        for (x in 0..limite) {
            println(x);
        }
    }
    //mapas
    println("********MAPAS**********");
    var diccionario= mutableMapOf<String,String>("hola" to "hello","adios" to "goodbye")
    diccionario["hola"]="Hello"
    println(diccionario["hola"])
    imprimir(10)

    //funcion flecha
    fun despedir(nombre:String ,apellido:String)="Hasta luego $nombre $apellido"
    println(despedir("karla","perez"))

    println("**************clases*****************")
    class Persona{
       // var nombre:String="Juan"
       //private  var apellido:String="perez"

        var nombre:String
        var apellido:String

        constructor(){
            this.nombre="juaco"
            this.apellido="lopez"
        }
       /* init{
            this.nombre="juaco"
            this.apellido="charris"
        }
        */
       fun imprimirAtributos(){
            println("nombre: ${this.nombre} ,apellido : ${this.apellido}")
       }
    }
    var persona=Persona()
    persona.nombre="Carlos"

    persona.imprimirAtributos()
    println(persona.nombre)
}