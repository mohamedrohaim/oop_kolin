package `interface`

fun main() {
    var obj1=Circle(2.5)
    var objRectangle=Rectangle(2.0,4.5)
    var objSquare=Squre(12.5)
    var demo=Demo()
    obj1.draw("yellow")
    var area=obj1.getArray()
  //  println(area)
  var result1:Double=  demo.poly1(obj1)
  var result2:Double=  demo.poly1(objRectangle)
  var result3:Double=  demo.poly1(objSquare)
  println(result1)
  println(result2)
  println(result3)

}