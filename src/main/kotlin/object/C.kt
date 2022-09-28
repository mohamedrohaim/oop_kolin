package `object`

class C {
    // companion object looks like static keyword in java
    companion object{
        var x:Int?=null
        var y:Int?=null
        fun sum() {
            var sum:Int=x!!+y!!
            println("$x+$y= $sum")

        }
        fun mul() {
            var result:Int=x!!*y!!
            println("$x*$y= $result")

        }
    }



}