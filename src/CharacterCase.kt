import java.util.*;


fun main(){
    println("Enter a Character");
    val reader = Scanner(System.`in`);
    var char = reader.next().single();
    if(char in 'A'..'Z'){
        println(1);
    }else if(char in 'a'..'z'){
        println(0)
    }else{
        println(-1);
    }
}