package `interface`

class Rectangle :Drawable{
    private var width:Double?=null
    private var height:Double?=null
    constructor(p_width:Double,p_height:Double){
        this.width=p_width
        this.height=p_height
    }
    override fun draw(color: String) {
        println("drawing rectangle..... color shape $color")
    }
    override fun getArray(): Double {
        return this.width!!*this.height!!
    }
}