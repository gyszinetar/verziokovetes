package hu.gyszinetar

fun main(){
    var A=A(25)
    A.kiir()
    println("Dui")
    globalFunction()
}

class A(int:Int){
    val int = int
    fun kiir(){
        println(int)
    }

}

fun globalFunction(){
    print("globalFunction")

}