import java.util.Scanner;
public class T6{
public static void main( String [] args){
Scanner sc = new Scanner(System.in);
double payrate;
double hours;
System.out.print("Enter pay rate for an hour:");
payrate = sc.nextDouble();
System.out.print("Enter the amount of hours worked each week:");
hours = sc.nextDouble();
double income = payrate * hours * 5;
double tax = income * 0.14;
double netincome = income - tax;
double clothes = netincome * 0.10;
double supplies = netincome * 0.01;
double bonds = netincome * 0.25;
double cont = bonds * 0.5;

System.out.println("Income before tax is $" + income);
System.out.println("Income after tax is $" + netincome);
System.out.println("Money spent on clothes $" + clothes);
System.out.println("Money spent on school supplies is $" + supplies);
System.out.println("Money spent on saving bonds is $" + bonds);
System.out.println("Money parents spent to buy additional savings bonds is $" + cont);
}
}







