package multiThreading

class HP:Runnable{
    constructor()
    override fun run(){
        for(i:Int in 0 until 10){
            println("HP $i")
            Thread.sleep(1000)
        }
    }

}
class Dell:Runnable{
    constructor()
    override fun run(){
        for(i:Int in 0 until 10){
            println("DELL $i")
            Thread.sleep(1000)
        }
    }

}

fun main() {
    var objHP:Runnable=HP()
    var objDELL:Runnable=Dell()
   // objHP.start()
   // objDELL.start()
    var t1=Thread(objHP)//receive an object of Runnable
    var t2=Thread(objDELL)
    t1.start()
    Thread.sleep(500)
    t2.start()
    println(t1.isAlive)
    t1.join()
    t2.join()
    println(t1.isAlive)
    println("End....!!")


}
