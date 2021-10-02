package com.example.operador

class Dado(var numero:Int) {

    fun Tirar(){
        var numerofinal = 0

        if(numero >=1 && numero <=6){
            var aleatorio = (1..60).random()
            numerofinal = aleatorio
            println("El numero aleatorio es: $numerofinal")

        }
        else{
            numerofinal = 1
            println("Usted ha lanzado un valor mayor que 6 por lo su numero final es: $numerofinal")
        }

    }
}