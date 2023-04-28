import java.util.*;

fun main(){
    println("Enter a Number");
    val reader = Scanner(System.`in`);
    var number = reader.nextInt();
    var even = 0 ;
    var odd = 0;
    while(number>0){
       var num = number%10;
        number /= 10;
        if(num%2==0){
            even+=num;
        }else{
            odd+=num;
        }
    }
    print("$even $odd");
}
