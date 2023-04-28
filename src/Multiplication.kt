import java.util.*;
fun main(){
    println("Enter a Number");
    val reader = Scanner(System.`in`);
    var input = reader.nextInt();
    for(i in 1 ..10){
        var ans = input*i;
        println(ans);
    }
}