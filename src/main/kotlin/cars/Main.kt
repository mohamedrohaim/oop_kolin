package cars

fun main() {

    var objBMW=BMW()
    var objToyota=TOYOTA()
    var objMerceds=Mercedes()
    var objDemo=Demo()
    objBMW.name="BMW 316 I"
    objBMW.model=2020
    objBMW.speed=180

    objDemo.poly(objBMW)
    println("---------------")
    objBMW.carInfo()
    objBMW.currentSpeed()
    objBMW.increaseSpeed(30)
    objBMW.decreaseSpeed(10)
    println("---------------")


    objToyota.name="corolla"
    objToyota.model=2021
    objToyota.speed=190
    objToyota.carInfo()
    objToyota.currentSpeed()
    objToyota.increaseSpeed(30)
    objToyota.decreaseSpeed(10)

    println("---------------")

    objMerceds.name="E 200"
    objMerceds.model=2022
    objMerceds.speed=190
    objMerceds.carInfo()
    objMerceds.currentSpeed()
    objMerceds.increaseSpeed(30)
    objMerceds.decreaseSpeed(10)



}