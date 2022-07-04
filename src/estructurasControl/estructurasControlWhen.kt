package estructurasControl

/* when es la misma que switch */
fun main(args: Array<String>) {

//     val calificacion = 5
//     val calificacion = 3
//     val calificacion = 1
    val calificacion = 'A'
    var resena:String

//     when (calificacion){
//         1 -> resena = "No me gusto la comida, me causo malestar."
//         2 -> resena = "No me gusto, pero la bebida si"
//         3 -> {println("El cliente califico con 3 estrellas")
//         	 resena = "Mediocre"} // para más de una sentecia es abrir y cerrar llaves
//         4 -> resena = "Me gusto pero puede mejorar"
//         5 -> resena = "La mejor comida mexicana en mucho tiempo"
//         else -> resena = "Reseña mal escrita"
//     }

//     when (calificacion) {
//         1 -> resena = "No me gusto la comida, me causo malestar."
//         2,3,4 -> {println("El cliente califico con $calificacion estrellas")
//         	 resena = "Mediocre"}
//         5 -> resena = "La mejor comida mexicana en mucho tiempo"
//         else -> resena = "Reseña mal escrita"
//     }

//     when (calificacion) {
//         in 1..5 -> {println("El cliente califico con $calificacion estrellas") // se utiliza para verificar que este dentro un rango
//             resena = "Mediocre"}
//         else -> resena = "Reseña mal escrita"
//     }

//     when (calificacion) {
//         calificacion >= 1 -> {println("El cliente califico con $calificacion estrellas") // se utiliza para verificar que este dentro un rango
//             resena = "Mediocre"}
//         else -> resena = "Reseña mal escrita"
//     }

    when (calificacion){
        'E' -> resena = "No me gusto la comida, me causo malestar."
        'D' -> resena = "No me gusto, pero la bebida si"
        'C' -> {println("El cliente califico con 3 estrellas")
            resena = "Mediocre"} // para más de una sentecia es abrir y cerrar llaves
        'B' -> resena = "Me gusto pero puede mejorar"
        'A' -> resena = "La mejor comida mexicana en mucho tiempo"
        else -> resena = "Reseña mal escrita"
    }

    print(resena) // no hace salto de linea
}