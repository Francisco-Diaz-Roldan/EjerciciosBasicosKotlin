class Ejercicio5 {
    /*5. Para un Array de String de títulos de películas, imprime el título de la película con el título más largo.
Por ejemplo si tenemos un array con los valores:
{“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
Debería imprimir “Batman: El caballero de la noche”.
RETO OPCIONAL: Imprime el índice del título más largo, para el ejemplo anterior, debería imprimir el
3, porque es el índice de “Batman: El caballero de la noche”*/

    fun peliculaMasLarga() : String {
        val peliculas = Array<String>(5) {"Jumanji";"Toy Story"; "Pulp Fiction"; "Batman: El caballero de la noche";"Kill Bill"}

        var mayorLongitud =0
        var peliculaMasLarga =""

        for (pelicula in peliculas){
            val longitudActual = pelicula.length
            if (longitudActual>=mayorLongitud){
                mayorLongitud=longitudActual
                peliculaMasLarga=pelicula
            }
        }


        return peliculaMasLarga
    }
}