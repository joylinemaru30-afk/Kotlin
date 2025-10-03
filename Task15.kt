fun main(){
    val age=23
    if(age==12){
        println("you are a child:$age")
    }
    else if(age in 13..19){
        println("you are a teenager:$age")
    }
    else if (age>=20){
        println("you are an adult: $age")
    }
    else{

        println("invalid age")
    }
}