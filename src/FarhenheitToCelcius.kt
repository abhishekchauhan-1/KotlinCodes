import java.util.*;
fun main(){
    val reader = Scanner(System.`in`);
    var startValue = reader.nextInt();
    var endValue = reader.nextInt();
    var stepSize = reader.nextInt();
    while(startValue<=endValue){
        var celcius  = (startValue-32)*5/9;
        println("$startValue  $celcius");
        startValue += stepSize;
    }
}