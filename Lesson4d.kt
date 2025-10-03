fun main(){
    //parameteres are values that get passed as arguments when we invoke a function
    greetings("Beingjoy")
    greetings("Becka")

    simpleintrest(rate=7,time=8, principle=50000.00)
}
fun greetings(name:String){
    println(" Hello " +name+" how have  you been ?  hope all is fine... ")
}
fun simpleintrest(rate:Int,time:Int,principle:Double){
    val si:Double=(rate*time*principle)/100

    println("the intrest gained is:" + si +"ksh")

}