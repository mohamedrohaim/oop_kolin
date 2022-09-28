package `interface`

class Circle :Drawable {
    private var radius:Double?=null
    constructor(p_radius:Double){this.radius=p_radius
    }

    override fun draw(color: String) {
        println("drawing circle..... color shape $color")
    }



    override fun getArray(): Double {
        return Math.PI*radius!! * radius!!
    }


}