import java.util.*;
class Calculator {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Welcome");
System.out.println("Enter first number");
double a = sc.nextDouble();
System.out.println("Enter second number");
double b = sc.nextDouble();
System.out.println("Enter any function add, sub, mul, div");
String coice = sc.next();
}
public static double add(double a, double b){
return a+b;
}
public static double sub(double a, double b){
return a-b;
}
public static double mul(double a, double b){
return a*b;
}
public static double div(double a, double b){
return a/b;
}
}
