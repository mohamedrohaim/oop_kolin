package any_class

fun main() {
  /*  var objA=A()
    objA.printVal()
    // casting
    var x:Int=10
    var y:Float
    y=x.toFloat() */
    var objF=First()
    var objS=Second()
    objF=objS as First
    objF.printFirst()
    //call method as an object A and access x var
    var objB=B()
    objB.getOBJ().x


}