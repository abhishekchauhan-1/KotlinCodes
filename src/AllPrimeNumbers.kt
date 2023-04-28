import java.util.*;
fun main(){
    println("Enter a Number");
    val reader = Scanner(System.`in`);
    val input: Int = reader.nextInt();

    for(i in 2..input){
        var count = 0;
        for(j in 2..i){
            if(i%j==0){
                count++;
            }
        }
        if(count==1){
            print("$i ");
        }
    }
}