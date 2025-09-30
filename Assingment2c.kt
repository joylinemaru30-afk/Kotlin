fun main(){
    val points=30200
    if(points<0){
        println("invalid input")
        
    }
    else if(points>0 && points<=100){
        println("To Win a phone")
    }
    else if(points>101 && points<=300){
        println("to win a laptop")
    }
    else if(points>301 && points<=1000){
        println("to win a car")
    }
    else{
        println("Trip to us")
    }
    
    
}