import java.util.Scanner;
public class T7{
public static void main( String [] args){
Scanner sc = new Scanner(System.in);
int A = 20;
int B = 15;
int C = 10;
int D = 5;

System.out.print("Amount of tickets of class A sold:");
int soldA = sc.nextInt();
System.out.print("Amount of tickets of class B sold:");
int soldB = sc.nextInt();
System.out.print("Amount of tickets of class C sold:");
int soldC = sc.nextInt();
System.out.print("Amount of tickets of class D sold:");
int soldD = sc.nextInt();

int incomeA = soldA * A;
System.out.println("Income from A tickets = " + incomeA + "$");
int incomeB = soldB * B;
System.out.println("Income from B tickets = " + incomeB + "$");
int incomeC = soldC * C;
System.out.println("Income from C tickets = " + incomeC + "$");
int incomeD = soldD * D;
System.out.println("Income from D tickets = " + incomeD + "$");
int income;
income = (incomeA + incomeB + incomeC + incomeD);
System.out.println(" Total income from all tickets = " + income + "$");

}
}

