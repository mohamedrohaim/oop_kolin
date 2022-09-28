package `interface`

class Squre:Drawable {
    private var height:Double?=null

    constructor(p_height:Double){
        this.height=p_height

    }

    override fun draw(color: String) {
        println("drawing squre..... color shape $color")
    }



    override fun getArray(): Double {
        return this.height!!*2
    }
}