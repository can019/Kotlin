fun main(){

    var a = Person("박보영", 1990)
    var b = Person("정유성")
    var c = Animal("멍멍",13,"개")
    var d = Dog("별이", 5)
    c.introduce()
    d.introduce()
    println("안녕하세요 ${a.name} 입니다")
}
class Person (var name:String, var birthYear:Int){
    init {
        println("생성되었습니다.")
    }

    constructor(name:String) :this(name,1997){
        println("보조생성자가 사용되었습니다.")
    }
}
open class Animal (var name:String, var age:Int, var type:String){
    fun introduce(){
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}
class Dog(name:String,age:Int) : Animal(name,age,"개")