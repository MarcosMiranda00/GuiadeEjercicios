package com.example.operador

class Empleado (var nombre:String, var sueldo:Double, var area:String, var cargo:String, var tiempotrabaj:Int){
    fun sueldofinal(){
        if(sueldo<0){
            println("No puede tener un sueldo menor a 0")
        }
        else if (area.isEmpty() || cargo.isEmpty()){
            println("Todos los campos tienen que estar llenos")
        }
        else{
            var sueldoextra:Int=25*(tiempotrabaj/5)
            var sueldodeveng = sueldoextra + sueldo

            println("Nombre: $nombre, tiene $tiempotrabaj años de trabajo, su sueldo base es de $sueldo y el total por sus años laborados es $sueldodeveng")
        }
    }

}