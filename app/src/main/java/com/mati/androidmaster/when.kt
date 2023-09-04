package com.mati.androidmaster

//El when es como el switch pero con steroides

fun main(){

}

fun getSemester(month: Int){
    when(month){
        //esto es para ver entre el 1 y el 6 , se le pone in primero
        in 1 < .. < 6 -> println("primer semestre")
        //para negaer
        !in 1 < .. < 6 -> println(" semestre ivalido")

    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Enero")
        3 -> println("Enero")
        4 -> println("Enero")
        //le pongo las {} para poner mas codigo
        5 ->{
            println("Enero")
            println("Enero")
        }
        else -> println("no es un mes loco")
    }
}