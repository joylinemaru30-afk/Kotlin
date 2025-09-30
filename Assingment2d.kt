fun main(){
    val points=30
    when (points){
    in 0..100->println("you win phone")
    in 101..300->println("you win a laptop")
    in 301..1000->println("you win a car")
    in 1001..1500->println("trip to us")
    else->println("invalid input")
    }
}