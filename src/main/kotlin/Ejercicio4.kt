class Ejercicio4 {
    /*Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del número que
insertes te imprima los siguientes valores
Ø 1 = “Soleado”
Ø 2 = “Nublado”
Ø 3 = “Lluvioso”
Ø 4 = “Tormentoso”
Ø 5 = “Nevado”
Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
Recomendación: Usa When.*/

    fun clima() : String {
        println("¿Cómo es el clima de hoy?")
        val respuesta = readLine()?.toIntOrNull()
        return when(respuesta){
           1 -> "Soleado"
           2 -> "Nublado"
           3 -> "Lluvioso"
           4 -> "Tormentoso"
           5 -> "Nevado"
           else -> "Pregúntale a Google"
        }
    }
}