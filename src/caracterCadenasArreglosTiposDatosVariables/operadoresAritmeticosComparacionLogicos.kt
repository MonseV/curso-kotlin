package caracterCadenasArreglosTiposDatosVariables

/* Estructuras de Control :
 * Introducción Operadores Aritméticos, de Comparación y lógicos */
fun main(args: Array<String>) {
    // + - / * Operadores Aritméticos
//     var suma = 10 + 10
//     var suma = 10 - 10
//     var suma = 10 * 10
//     var suma = 10 / 10
//     var suma = 10 / 0

//      println(suma)

    // < > == <= >= Comparación
//     var a = 5
//     var a = 8
//     var b = 8

//     println(a < b)
//     println(a == b)
//     println(a <= b)

    // && || ! Lógicos
    var a = 8
    var b = 8
//     var datoBoleano = a != b
    var c = 7

//     println(a != b)
//     println(datoBoleano)
// //     		 true	  false -> false
//     println(a == b && c > a)
// //     		 true	  false -> true
//     println(a != b || c < a)
// //     		 	  true		  &&   false -> false
//     println((a != b || c < a) && (b == c))
//     		 	  true		  ||   false -> true
    println((a != b || c < a) || (b == c))
}