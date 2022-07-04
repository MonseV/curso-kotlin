package estructurasCiclicas

/* Ciclos For */
fun main(args: Array<String>) {

//     for(i in 1..10) println(i) // forma sencillas

//     for((indice,valor) in (4..18).withIndex()){
//         println("Esta es la vez número ${indice + 1} que entro al bloque de código con valor de $valor")
//     }

    var arregloInt = intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)

    for((indice,valor) in arregloInt.withIndex() ) {

        println("El indice $indice representa el valor de: $valor")
    }
}