package POO

//class Frutas(){
//
//    var color:String = ""
//    var sabor:String = ""
//    var precio:Int = 0
//    var numHojas:Int = 0
//
//    // Tipo de Estructura llamada Init -> inicializador -> en vez de arriba puede ser aquí
//    /* init{
//        this.color = color // this.color se refiere al que esta dentro del alcanze de la clase(var) y color se refiere al parametro que recibimos
//        this.sabor = sabor
//        this.precio = precio
//    } */
//
//    // Método Contructor -> se puede tener más de un constructor
//    constructor(color:String, sabor:String, precio:Int):this(){
//        this.color = color // this.color se refiere al que esta dentro del alcanze de la clase(var) y color se refiere al parametro que recibimos
//        this.sabor = sabor
//        this.precio = precio
//    }
//    constructor(color:String, sabor:String, precio:Int, numHojas:Int):this(){
//        this.color = color
//        this.sabor = sabor
//        this.precio = precio
//        this.numHojas = numHojas
//    }
//
//    // Métodos
//    fun pudrirse(){
//        print("La fruta se está pudriendo")
//    }
//}
//
//fun main(args: Array<String>) {
//
//    // Instanciar un objeto -> Crear un objeto
//    var manzanaConHojas = Frutas("Rojo","Dulce",4,2)
//    var manzanaSinHojas = Frutas("Rojo","Dulce",4)
//
//    // Accediendo a la propiedad
//    println(manzanaConHojas.numHojas)
//
//    // Accediendo al método
//    manzanaSinHojas.pudrirse()
//}