package `object`

fun main() {
    var obj =A()
    obj.num=10
   // println(obj) //object.A@15aeb7ab
   //B.number=100 //create an object without create from Object class
    Books.myBooks.add("data structure")
    Books.printBooks()
    Books.myBooks.add("java")
    Books.myBooks.add("kotlin")
    Books.myBooks.add("python")
    Books.myBooks.add("c++")
    Books.myBooks.add("android")
    Books.printBooks()
    C.x=10   // this var in  companion object so we can access it without creating an object
             // it looks like static keyword in java
    C.y=12
    C.sum()
    C.mul()

}