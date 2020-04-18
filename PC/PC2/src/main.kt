fun main(){

    var a = Person("박보영", 1990)
    var b = Person("정유성")
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