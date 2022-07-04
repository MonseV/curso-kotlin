package caracterCadenasArreglosTiposDatosVariables

fun main(args: Array<String>) {
    var a  = 5
    var b = 3
    var c = -12
    var operacionBoleanoA = a > 3
    var operacionBoleanoB = a > b
    var operacionBoleanoC = a < c
    var operacionBoleanoD = c < b
    var operacionBoleanoE = b != a
    var operacionBoleanoF = a == 8
    var operacionBoleanoG = b * c == 18
    var operacionBoleanoH = a * b == -30
    var operacionBoleanoI = c / b < a
    var operacionBoleanoJ = c / b == -11
    var operacionBoleanoK = c / b == -4
//     var operacionBoleanoL = a + c + b = // incompleta
    var operacionBoleanoM = (a+b == 8) && (a-b == 2)
    var operacionBoleanoN = (a+b == 8) || (a-b == 6)
    var operacionBoleanoO = a > 3 && b > 4 && c < 3
    var operacionBoleanoP = a > 3 && b >= 3 && c < -3


    var cadena = "La respuesta de la pregunta"

    /*
     * a) a > 3
     	  5 mayor que 3
          true
    */
    println("${cadena} a) a > 3 es igual a: ${operacionBoleanoA} ")

    /*
     * b) a > b
     	  5 mayor que 3
          true
    */
    println("${cadena} b) a > b es igual a: ${operacionBoleanoB} ")

    /*
     * c) a < c
     	  5 menor que -12
          false
    */
    println("${cadena} c) a < c es igual a: ${operacionBoleanoC} ")

    /*
     * d) c < b
     	  -12 menor que 3
          true
    */
    println("${cadena} d) c < b es igual a: ${operacionBoleanoD} ")

    /*
     * e) b != a
     	  3 es diferente a 5
          true
    */
    println("${cadena} e) b != a es igual a: ${operacionBoleanoE} ")

    /*
     * f) a == 8
     	  5 es igual a 8
          false
    */
    println("${cadena} f) a == 8 es igual a: ${operacionBoleanoF} ")

    /*
     * g) b * c == 18
     	  3 * -12
          -36 es igual a 18
          false
    */
    println("${cadena} g) b * c == 18 es igual a: ${operacionBoleanoG} ")

    /*
     * h) a * b == -30
     	  5 * 3
          15 es igual a -30
          false
    */
    println("${cadena} h) a * b == -30 es igual a: ${operacionBoleanoH} ")

    /*
     * i) c / b < a
     	  -12 / 3 < 5
          - 4 < 5
          true
    */
    println("${cadena} i) c / b < a es igual a: ${operacionBoleanoI} ")

    /*
     * j) c / b == -11
     	  -12 / 3
     	  -4 es igual a -11
          false
    */
    println("${cadena} j) c / b == -11 es igual a: ${operacionBoleanoJ} ")

    /*
     * k) c / b == -4
     	  -12 / 3
          -4 es igual a -4
          true
    */
    println("${cadena} k) c / b == -4 es igual a: ${operacionBoleanoK} ")

    /*
     * l) a + c + b = // incompleta
    */

    /*
     * m) (a+b == 8) && (a-b == 2)
     	  (5 + 3 == 8) && (5 - 3 == 2)
          (8 == 8) && (2 == 2)
          true && true
          true
    */
    println("${cadena} m) (a+b == 8) && (a-b == 2) es igual a: ${operacionBoleanoM} ")

    /*
     * n) (a+b == 8) || (a-b == 6)
     	  (5 + 3 == 8) || (5 - 3 == 6)
          (8 == 8) || (2 == 6)
          true && false
          true
    */
    println("${cadena} n) (a+b == 8) || (a-b == 6) es igual a: ${operacionBoleanoN} ")

    /*
     * o) a > 3 && b > 4 && c < 3
     	  5 > 3 && 3 > 4 && -12 < 3
          true && true && false
          false
    */
    println("${cadena} o) a > 3 && b > 4 && c < 3 es igual a: ${operacionBoleanoO} ")

    /*
     * p) a > 3 && b >= 3 && c < -3
     	  5 > 3 && 3 >= 3 && -12 < -3
          true && true && true
          true
    */
    println("${cadena} p) a > 3 && b >= 3 && c < -3 es igual a: ${operacionBoleanoP} ")
}