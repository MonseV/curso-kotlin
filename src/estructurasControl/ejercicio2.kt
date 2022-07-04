package estructurasControl

fun main(args: Array<String>) {

    /* PARTE I */ // * El println debe de quedar igual
    // * Reducir a 4 líneas de código
//     var numeros:Array<Int> = arrayOf(123, 11, 5)
//     var numeroMayor:Int
//
//     numeroMayor = if(numeros[0] > numeros[1] && numeros[0] > numeros[2]) numeros[0] else if( numeros[1] > numeros[0] && numeros[1] > numeros[2]) numeros[1] else numeros[2]
//
//     println("El numero mayor de todas mis variables es: $numeroMayor")

    // * Después a 3 líneas de código
//     var numeros:Array<Int> = arrayOf(123, 11, 5)
//
//     var numeroMayor:Int = if(numeros[0] > numeros[1] && numeros[0] > numeros[2]) numeros[0] else if( numeros[1] > numeros[0] && numeros[1] > numeros[2]) numeros[1] else numeros[2]
//
//     println("El numero mayor de todas mis variables es: $numeroMayor")


    /*
     * PARTE II
        * Buscar el error de lógica, es decir, de que manera truena el programa(no compila)
        * Corregirlo
    */

//     ERROR: no acepta un numero flotante porque se especifica que el numero mayor es de tipo entero

    var a = 123.5
    var b = 11
    var c = 5
//    var numeroMayor:Int
    var numeroMayor:Any

    numeroMayor = if(a > b && a > c) a else if( b > a && b > c) b else c

    println("El numero mayor de todas mis variables es: $numeroMayor")
}