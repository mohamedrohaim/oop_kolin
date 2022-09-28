package cars

//subclass
class TOYOTA :Car{
    constructor(){

    }

    override fun carInfo() {
        println("name: ${super.name}")
        println("model: ${super.model}")
        println("speed: ${super.speed}")
    }

    override fun currentSpeed() {
        println("current speed : ${super.speed}")
    }
    // Exception catcher fun
    override fun increaseSpeed(in_speed: Int) {
        super.speed=super.speed!!+in_speed
        try {
            if (super.speed!! > 315) {
                //  var ex=Exception("speed is out of range")
                throw Exception("speed is out of range")
            } else if (super.speed!! > 200) {

                throw Exception("warning!!...reduce the speed")
            }
            println("speed after increase: ${super.speed}")
        }catch (e:Exception){
            println(e.message)

        }

    }

    override fun decreaseSpeed(de_speed: Int) {
        super.speed=super.speed!!-de_speed
        println("speed after decrease: ${super.speed}")
    }
}