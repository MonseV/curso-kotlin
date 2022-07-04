package funciones

/* Imprimir los primeros 18 numeros de la Serie de Fibonacci
 * Fibonacci : 0, 1, 1, 2, 3, 5 ,8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 *	0
 *	1
 *		1 -> 0 + 1
 *			2 -> 1 + 1
 *				3 -> 2 + 1
 */
fun main(args: Array<String>) {
    var f0 = 0 //f0
    var f1 = 1 //f1

    println(f0)
    println(f1)

    for (i in 0..15) {
        var f = fibonacci(f1, f0)
        f0=f1
        f1=f
        println(f)
    }
}

fun fibonacci(x:Int,y:Int):Int{
    return x+y
}