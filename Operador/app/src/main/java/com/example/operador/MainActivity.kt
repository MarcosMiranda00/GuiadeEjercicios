package com.example.operador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operario("Marcos", 8.00, 250, 10)
        tablademultiplicar(8)
        Empleado("Marcos", 800.0, "Gerencia", "Director", 20).sueldofinal()
        Dado(7).Tirar()
    }

    fun operario( nombre:String, pagoxhora:Double, horastrabajadas:Int, horasextra:Int){
        var sueldofinal: Double = (pagoxhora * horastrabajadas)
        var horas = (horasextra * pagoxhora)*2
        var sueldomashoras = sueldofinal + horas

        println("Nombre Empleado: $nombre \nSueldo Base: $sueldofinal \nSueldo Base \nHoras Extra: $sueldomashoras")

    }

    fun tablademultiplicar(numero:Int){
        val valor: Int = 10;

        for (x  in 1..10){
        println("$numero  x $x = ${numero*x}")
     }
    }

}