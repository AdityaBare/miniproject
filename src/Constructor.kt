fun main(){
    val  emp = Employ(98,"Om" )

}

class Employ(var name:String ,var  age : Int){
    public constructor(age: Int ,name: String) : this(name,age) {
        println("Secondary constructor")
        println("Name :-"+name)
        println("Age :-"+age)
    }


    init{
        println("Init constructor")
    }



}