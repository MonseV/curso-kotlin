package estructurasControl

/* If Else */
fun main(args: Array<String>) {

//     var a = 10
    var a = 123
    var b = 11


//     if(a > b){
//         println("La variable a es mayor a la variable b")
//     }else{
//         println("La variable b es mayor a la variable a")
//     }

//     if(a > b) println("La variable a es mayor a la variable b") else println("La variable b es mayor a la variable a")


    var c = 5
    var numeroMayor:Int

    numeroMayor = if(a > b && a > c) a else if( b > a && b > c) b else c

    println("El numero mayor de todas mis variables es: $numeroMayor")

}