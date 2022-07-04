package POO

class Fruits(color:String, sabor:String, precio:Int, frescura:Int){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var frescura:Int = 0

    // Tipo de Estructura llamada Init -> inicializador
    init{
        this.color = color // this.color se refiere al que esta dentro del alcanze de la clase(var) y color se refiere al parametro que recibimos
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
    }

    // Métodos
    fun pudrirse():Int{
        // cada que se llame fescura -20
        println("La fruta se está pudriendo")
        this.frescura = this.frescura - 20
//         println("La fruta tiene ${this.frescura}% de frescura")
        return frescura
    }

    fun fresco(){
        var p = pudrirse()
        println("La fruta tiene ${p} % de frescura")
    }
}

fun main(args: Array<String>) {

    // Instanciar un objeto -> Crear un objeto
    var manzana = Fruits("Rojo","Dulce",4,100)

    // Accediendo a la propiedad
    println(manzana.color)

    // Accediendo al método
//     manzana.pudrirse()
    manzana.fresco()
    manzana.fresco()
    manzana.fresco()
}