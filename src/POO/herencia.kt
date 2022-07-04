package POO

// Herencias -> adquiere sus propiedades y metodos de la Clase Padre

open class Frutas(){ /* Clase Tipo Open -> Clase abierta para que se pueda heredar de ella
                       				       Ej: open class Frutas(){}
                 		Clase Tipo Final -> Una vez que compilamos el programa ya no se puede heredar
                   					        Ej: class Frutas(){}
    				 */

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0

    // Método Contructor -> se puede tener más de un constructor
    constructor(color:String, sabor:String, precio:Int):this(){

        this.color = color // this.color se refiere al que esta dentro del alcanze de la clase(var) y color se refiere al parametro que recibimos
        this.sabor = sabor
        this.precio = precio
    }

    // Métodos
    fun pudrirse(){
        print("La fruta se está pudriendo")
    }
}

class FrutasConGrasa():Frutas(){

    var cantidadGrasa:Int = 0

    constructor(grasa:Int):this(){

        this.cantidadGrasa = grasa
    }
}

fun main(args: Array<String>) {

    // Instanciar un objeto -> Crear un objeto
    var manzana = Frutas("Rojo","Dulce",4)
    var aguacate = FrutasConGrasa(10)

    // Asignando un color por medio de Herencia
    aguacate.color = "verde"

    // Accediendo a la propiedad
    println(aguacate.cantidadGrasa)
    println(aguacate.color)

    aguacate.pudrirse()
}