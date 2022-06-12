package com.hariom.androidinterviewcode

fun main(args: Array<String>) {
        val tile = Tile.Red("Fire red", 22)
    println(tile.type)
}
sealed class Tile(){
    class Red(val type : String, val point : Int) : Tile()
    class Blue(val point : Int) : Tile()
}

