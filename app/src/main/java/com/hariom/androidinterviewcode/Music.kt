package com.hariom.androidinterviewcode
import com.hariom.androidinterviewcode.validation
class Music : IPlayMusic, IPlayVideo{
    override fun play(){
        super<IPlayMusic>.play()
        super<IPlayVideo>.play()
    }

}

fun main() {
    val music = Music()
    music.play()
    validation()

    AbstractionTest.testStatic()
//    val abTest = AbstractionTest()
//    abTest.printMsg()
}