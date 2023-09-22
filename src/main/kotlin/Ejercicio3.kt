class Ejercicio3 {
    /*3. Escribe un programa que te diga si un Uber puede iniciar su recorrido. Para esto se necesitan dos
cosas, que el conductor esté cerca y que esté disponible, el programa te pedirá dos valores, la
distancia del conductor en kilómetros y su disponibilidad, donde false = no disponible y true =
disponible, según los datos que insertes imprime lo siguiente:
Ø Si la distancia es menor o igual a 0.5 km y el conductor está disponible, imprime “Listo para
iniciar recorrido”
Ø Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible, imprime, “Conductor
cercano, pero no disponible”
Ø Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime, “Conductor disponible
pero muy lejos, aplicarán tarifas más altas”
Ø Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime, “No hay
conductores disponibles”
RETO OPCIONAL: Si no se cumplen las condiciones de “Listo para iniciar recorrido”, después de
imprimir el mensaje, vuelve a pedir los datos de distancia y disponibilidad*/

    fun uber(km: Float, disponible: Boolean): String {
        return when {
            km <= 0.5f && disponible -> "Listo para iniciar recorrido"
            km <= 0.5f && !disponible -> "Conductor cercano, pero no disponible"
            km > 0.5f && disponible -> "Conductor disponible pero muy lejos, aplicarán tarifas más altas"
            else -> "No hay conductores disponibles"
        }
    }

    fun uberOpcional(): String {
        var mensaje: String = ""
        do {
            println("Introduce la distancia a la que esta el conductor: ")
            val km = readln().toFloat()

            println("¿Esta disponible el conductor? (true || false)")
            val disponible = readln().toBoolean()

            if (disponible && km <= 0.5f) {
                mensaje = "Listo para iniciar recorrido"
            } else if (!disponible && km <= 0.5f) {
                mensaje = "Conductor cercano, pero no disponible"
            } else if (disponible && km > 0.5f) {
                mensaje = "Conductor disponible pero muy lejos, aplicarán tarifas más altas"
            } else {
                mensaje = "No hay conductores disponibles"
            }
            if (!(disponible && km <= 0.5f)){
                println(mensaje)
            }
        }while (!(disponible && km <= 0.5f))
        return mensaje
    }
}

/*fun uber(km : Float, disponible : Boolean) : String{
        /*var mensaje = ""

        if(km<=0.5f && disponible ==true){
            mensaje ="Listo para iniciar recorrido"
        }else if (km<=0.5f && disponible ==false){
            mensaje = "Conductor cercano, pero no disponible"
        }else if (km>0.5f && disponible ==true){
            mensaje = "Conductor disponible pero muy lejos, aplicarán tarifas más altas"
        }else{
            mensaje = "No hay conductores disponibles"
        }
        return mensaje*/
        }*/

