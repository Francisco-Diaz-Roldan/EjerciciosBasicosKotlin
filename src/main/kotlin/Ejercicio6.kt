class Ejercicio6 {
    /*Escribe un programa que para un número N, imprima los números pares desde 1 hasta N, por ejemplo
si N = 6, debe imprimir “2, 4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes
imprimir “Inserta un número positivo*/

    private fun esPar(n: Int): Boolean {
        return n % 2 == 0
    }

    fun rangoPares(){
        do {
            println("Inserta un número positivo")
            val n = readln().toInt()
            println("Numeros pares en el rango de 1 a $n...")
            for (i in 2..n step 1){
                if (esPar(i))
                    print(i)
                if(!esPar(i)&&(n!=2)&&(i<n))
                    print(",")
            }
        }while (n<0)
    }
}