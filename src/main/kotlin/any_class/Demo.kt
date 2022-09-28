package any_class

class Demo {
    companion object {



        fun show(any:Any){
            any as First
            any.printFirst()
        }
        fun returnShow(): First {
            return First()
        }
    }


}