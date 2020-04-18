fun main(){

    var a = Person("박보영", 1990)
    println("안녕하세요 ${a.name} 입니다")
}
class Person (var name:String, var birthYear:Int)