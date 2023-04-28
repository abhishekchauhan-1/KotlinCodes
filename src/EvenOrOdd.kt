import java.util.*;
fun main(){
    println("Enter a Number To check Even Or Odd")
    val read = Scanner(System.`in`);
    var i: Int = read.nextInt()
    if(i%2==0){
        println("Number is Even")
    }else{
        println("Number is Odd")
    }
}