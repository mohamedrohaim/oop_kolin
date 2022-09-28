package anonymose_class

fun main() {
    var objDemo=Demo()
    objDemo.show()

    //anonymous class
    var obj=object :MyInterface
    {
        override fun show() {
            println("hello from object")
        }

    }
    obj.show()
    //polymorphism with anonymous class
    A.poly(obj)
}