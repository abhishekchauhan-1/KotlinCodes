import java.util.*;
fun main(){
    println("Enter a Name and Three Numbers by pressing Enter Key each Time");
    val reader = Scanner(System.`in`);
    var name = readLine();
    var m1 = reader.nextInt();
    var m2 = reader.nextInt();
    var m3 = reader.nextInt();
    var avg = (m1+m2+m3)/3;
    println(name);
    println(avg);
}