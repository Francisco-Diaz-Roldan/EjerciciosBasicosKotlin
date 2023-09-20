class Ejercicio6 {
    /*Escribe un programa que para un número N, imprima los números pares desde 1 hasta N, por ejemplo
si N = 6, debe imprimir “2, 4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes
imprimir “Inserta un número positivo*/

    fun esPar(n : Int) : Boolean{
        var par : Boolean
        if (n%2==0){
            par =true
        }else {
            par=false
        }
        return par
    }

    fun rangoPares(){
        var N : Int =1
        do {
            println("Inserta un número positivo")
            val N = readLine()!!.toInt()
        }while (N<0)

        println("Numeros pares en el rango de 1 a $N...")
        for (i in 1..N step 1){
            if (esPar(i)){
               println(i)
            }
        }
    }
}