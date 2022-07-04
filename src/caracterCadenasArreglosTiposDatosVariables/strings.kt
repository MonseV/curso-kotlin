package caracterCadenasArreglosTiposDatosVariables

/* Tipos de Datos: Strings con secuencia de escape y Strings Puros(raw strings)
*/
fun main(args: Array<String>) {

//     var cadena:String = "Juan\n\tVillalvazo" // secuencia de escape (\n, \t, etc) conmumente utilizado en Java
//     var cadena:String = """Juan \n \t
//                Villalvazo""" // string puro
    var cadena1:String = "Juan"
    var cadena2:String = " Villalvazo"
    var dinero:Int = 10

    println(cadena1.length)
    println(cadena1 + cadena2)
    println("Mi nombre es: " + cadena1)
    println("Mi nombre es: $cadena1 y tiene ${cadena1.length} caracteres")
    println("Mi nombre es: $cadena1 y tengo $10 dolares")
    println("Mi nombre es: $cadena1 y tengo $dinero dolares")
    println("Mi nombre es: $cadena1 y tengo ${'$'}$dinero dolares")
}