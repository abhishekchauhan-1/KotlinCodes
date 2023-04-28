import java.util.*;
fun main(){
    println("Enter a number");
    val reader = Scanner(System.`in`);
    var input = reader.nextInt();
    for( i in 2..input){

        if(input%i==0){
            println(i);
        }
    }
}