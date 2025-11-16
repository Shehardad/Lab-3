import java.util.Scanner;
public class T4{
 public static void main( String [] args){
 Scanner sc = new Scanner(System.in);
  int min;
  int hours;
  int minutes;
 System.out.print("Enter the number of minutes passed since midnight:");
 min = sc.nextInt();
 minutes = min % 60;
 hours = min / 60;
 System.out.println("The time is " + hours + ":" + minutes);
}
}
 
   
   
