package com.hariom.androidinterviewcode

class Music : IPlayMusic, IPlayVideo{
    override fun play(){
        super<IPlayMusic>.play()
        super<IPlayVideo>.play()
    }
}

fun main() {
    val music = Music()
    music.play()
}