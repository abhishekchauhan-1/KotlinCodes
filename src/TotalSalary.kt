import java.util.*;
import kotlin.math.roundToInt

fun main(){
    val reader = Scanner(System.`in`);
    val basicSalary = reader.nextInt();
    val char = reader.next().single();
    var allowances = 0;
    if(char =='A'){
        allowances = 1700;
    }else if(char=='B'){
        allowances = 1500;
    }else{
        allowances = 1300;
    }
    val hra:Double = (0.20*basicSalary);
    val da: Double = (0.50*basicSalary);
    val pf: Double = (0.11*basicSalary);

    val salary: Double= basicSalary.toDouble()+hra+da+allowances-pf;
    val total: Int = salary.roundToInt();
    println(total);

}