class Ejercicio1 {
    /*1. Crea un programa que te pida una cantidad en miligramos para una poción mágica, el valor debe ser
de tipo entero, si el valor es mayor a 100 imprime “¡Felicidades, es una buena poción!”, de lo
contrario imprime “La poción es mediocre, sangre sucia inmunda”.*/

    fun pocionMagica(cantidad : Int) : String {
        var resultado = ""
        if (cantidad > 100) {
            resultado ="¡Felicidades, es una buena poción!"
        }
        else{
            resultado ="La poción es mediocre, sangre sucia inmunda"
        }
        return resultado
    }

}