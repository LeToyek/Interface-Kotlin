package Main

import Data.Warkop
import Data.gare

fun main(){
    val tegal = Warkop("La Boulangerie")
    val balapan = gare("balapan")

    tegal.sayHello("Jatmiko")
    tegal.offerSell()
    tegal.direAdieu()

    tegal.sayHello("Suprapto")
    tegal.direAdieu()

    balapan.sayHello("Bambang")
    balapan.partir()
    balapan.payer()
}