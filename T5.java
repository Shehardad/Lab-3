import java.util.Scanner;
public class T5{
 public static void main( String [] args){
Scanner sc = new Scanner(System.in);
double milk;
double cartons;
double cost;
double profit;
System.out.print("Enter the amount of milk produced:");
milk = sc.nextDouble();
cartons = milk / 3.78;
System.out.printf("The amount of cartons need to hold " + milk + " litres of milk are %3.2f\n" , cartons);
cost = milk * 0.38;
System.out.println("The cost for producing " + milk + " litres of milk is " + cost + "$");
profit = cartons * 0.27;
System.out.printf("The profit for " + milk + " litres of milk is " + "%3.2f" + "$" , profit);
}
}








