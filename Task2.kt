fun main(){
    val principal:Int=5000
    val rate:Int=6
    val time:Int=5

    val intrest=principal*(1+rate/100)*time*time*time
    val ci=intrest-principal

    println("the ci is:$ci")
}