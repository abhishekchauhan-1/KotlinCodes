import java.util.*;
fun main(){
    println("Enter a Number To check Prime Or Not");
    val reader = Scanner(System.`in`);
    var input = reader.nextInt();
    var count = 0;
    for(i in 2..input){
        if(input%i==0){
            count++;
        }
    }
    if(count==1){
        println("Number is Prime");
    }else{
        println("Number is Not Prime");
    }
}