package cars

//super class
abstract class Car {
    var name:String?=null
    var model:Int?=null
    var speed:Int?=null


    abstract fun carInfo()
    abstract fun currentSpeed()
    abstract fun increaseSpeed(in_speed:Int)
    abstract fun decreaseSpeed(de_speed:Int)





}