import com.example.ejerciciosbasicosdeprogramacionenkotlin.Ejercicio2

fun main(args: Array<String>) {

    println("Ejercicio1")
    // Creo una instancia de la clase Ejercicio1
    val ejercicio1 = Ejercicio1()

    // Llamo a la función pocionMagica
    val resultado1 = ejercicio1.pocionMagica(120)

    // Imprimo el resultado en la consola
    println(resultado1)
    println("")


    //Hago lo mismo con el resto de ejercicios
    //Ejercicio 2
    println("Ejercicio2")
    val ejercicio2 = Ejercicio2()
    val resultado2 = ejercicio2.sumatoriaNumerosConFor(5)
    println(resultado2)
    println("")

    //Ejercicio 3
    println("Ejercicio3")
    val ejercicio3 = Ejercicio3()
    val resultado3 = ejercicio3.uber(0.5f, true)
    println(resultado3)
    println("")

    //Ejercicio 4
    println("Ejercicio4")
    val ejercicio4 = Ejercicio4()
    val resultado4 = ejercicio4.clima()
    println(resultado4)
    println("")

    //Ejercicio 5
    println("Ejercicio5")
    val ejercicio5 = Ejercicio5()
    val resultado5 = ejercicio5.peliculaMasLarga()
    println(resultado5)
    println("")
}