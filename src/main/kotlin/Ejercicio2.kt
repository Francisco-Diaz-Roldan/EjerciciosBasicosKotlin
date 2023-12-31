package com.example.ejerciciosbasicosdeprogramacionenkotlin

class Ejercicio2 {
    /*Haz un ciclo for y while que obtenga la sumatoria de los números hasta n (ejemplo: para 5 debes
obtener 15 (1+2+3+4+5), para 3 debes obtener 6). Imprime el resultado así: “La suma es 15” usando
formatos de String.*/

    fun sumatoriaNumerosConFor(n: Int): String {
        var total = 0

        for (i in 1..n step 1) {
            total += i
        }
        return "La suma es $total"
    }

    fun sumatorioNumerosConWhile(n: Int): String {
        var total = 0

        val i = 1
        while (i <= n) {
            total += i
        }
        return "La suma es $total"

    }
}