import java.util.Scanner;
public class T1{
 public static void main( String [] args){
  Scanner sc = new Scanner(System.in);
  double amount;
  double dollars;
  double cents;
  double quarters;
  double nickels;
  double pennies;
  double dimes;
  System.out.print("Enter an amount in decimal numbers:");
  amount = sc.nextDouble();
  cents = amount * 100;
  System.out.println("Cents =" + cents);
  dollars = cents / 100;
  System.out.println("Dollars =" + (int)(dollars));
  cents = cents % 100;
  
  quarters = cents / 25;
  System.out.println("Quarters =" + (int)quarters);
  cents = cents % 25;
  
  dimes = cents / 10;
  System.out.println("Dimes =" + dimes);
  cents = cents % 10;
 
  nickels = cents / 5;
  System.out.println("Nickels =" + nickels);
  cents = cents % 5;
 
  pennies = cents;
  System.out.println("Pennies =" + pennies);
}
}
  
  
  
  

  
  
  
  
   
   
