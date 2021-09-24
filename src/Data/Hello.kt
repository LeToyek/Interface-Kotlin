package Data

//Interface is like a contract that you need to override every single stuffs in the body
//you can also do something after did the mandatory thing
//It's prohibited to put initializer in the interface
//as long as you make an universal function in the interface then you can use it wherever you want
//conflict between 2 interface could be ended by adding an override that contain super<functionA>.function()


interface Hello{
    val name : String
    fun sayHello(name:String)
    fun direAdieu(){
        println("Au revoir bonne journée!")
        println("Nous vous attendons pour la prochaine fois  ")
    }
}
interface partir : Hello{
    fun partir(){
        println("PARTIR")
    }
}

interface payerA{
    fun payer(){
        println("payerA")
    }
}
interface payerB{
    fun payer(){
        println("payerB")
    }
}

class Warkop(override val name: String): Hello{
    override fun sayHello(name: String) {
        println("\nBonjour $name ! Vous etes dans ${this.name} maintenant")
    }
    fun offerSell(){
        println("Vous voulez combi                        en de pain ?")
    }
}
class gare(override val name: String):partir,payerA,payerB{

    override fun sayHello(name: String) {
        println("$name bienvenue dans la gare!")
    }

    override fun payer() {
        super<payerA>.payer()
        super<payerB>.payer()
    }

}